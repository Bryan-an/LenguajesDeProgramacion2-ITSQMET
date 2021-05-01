/**
 * Deber 1 Lenguajes de programación 2 - Operaciones Aritméticas.
 */
package com.desarrollo.deber1;

/**
 *
 * @author bryan
 */
public class Equal {

    /**
     * Method that performs the operation.
     *
     * @param str Operation.
     * @return The result of the operation.
     */
    public static double calculate(final String str) {
        return new Object() {
            int position = -1, character;

            //
            void nextChar() {
                character = (++position < str.length()) ? str.charAt(position) : -1;
            }

            boolean eat(int charToEat) {
                if (character == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            double parse() {
                nextChar();
                double x = parseExpression();
                if (position < str.length()) {
                    throw new RuntimeException("Unexpected: " + (char) character);
                }
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor
            double parseExpression() {
                double x = parseTerm();
                for (;;) {
                    if (eat('+')) {
                        x += parseTerm(); // addition                                           
                    } else if (eat('-')) {
                        x -= parseTerm(); // subtraction
                    } else {
                        return x;
                    }
                }
            }

            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if (eat('*')) {
                        x *= parseFactor(); // multiplication
                    } else if (eat('/')) {
                        x /= parseFactor(); // division
                    } else {
                        return x;
                    }
                }
            }

            double parseFactor() {
                if (eat('+')) {
                    return parseFactor(); // unary plus
                }
                if (eat('-')) {
                    return -parseFactor(); // unary minus
                }
                double x;
                int startPosition = this.position;
                if (eat('(')) { // parentheses
                    x = parseExpression();
                    eat(')');
                } else if ((character >= '0' && character <= '9') || character == '.') { // numbers
                    while ((character >= '0' && character <= '9') || character == '.') {
                        nextChar();
                    }
                    x = Double.parseDouble(str.substring(startPosition, this.position));
                } else if (character == '√') { // sqrt
                    while (character == '√') {
                        nextChar();
                    }
                    String func = str.substring(startPosition, this.position);
                    x = parseFactor();
                    if (func.equals("√")) {
                        x = Math.sqrt(x);
                    } else {
                        throw new RuntimeException("Unknown function: " + func);
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + (char) character);
                }

                if (eat('^')) {
                    x = Math.pow(x, parseFactor()); // exponentiation
                }
                return x;
            }
        }.parse();
    }
}
