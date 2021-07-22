/**
 * Deber 3 Lenguajes de programación 2 - Calculadora división.
 */
package com.desarrollo.calculator;

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
            //Variables
            int position = -1, character;

            /**
             * Method that moves the position to the next character.
             */
            void nextChar() {
                character = (++position < str.length()) ? str.charAt(position) : -1;
            }

            /**
             * Method that evaluates symbols.
             */
            boolean eat(int charToEat) {
                if (character == charToEat) {
                    nextChar();
                    return true;
                }
                return false;
            }

            /**
             * Method that returns the result.
             */
            double parse() {
                nextChar();
                double x = parseExpression();
                if (position < str.length()) {
                    throw new RuntimeException();
                }
                return x;
            }

            // Grammar:
            // expression = term | expression `+` term | expression `-` term
            // term = factor | term `*` factor | term `/` factor
            // factor = `+` factor | `-` factor | `(` expression `)`
            //        | number | functionName factor | factor `^` factor
            /**
             * Method that performs addition and subtraction.
             */
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

            /**
             * Method that performs multiplication and division.
             */
            double parseTerm() {
                double x = parseFactor();
                for (;;) {
                    if (eat('x')) {
                        x *= parseFactor(); // multiplication                                              
                    } else if (eat('÷')) {
                        x /= parseFactor(); // division
                    } else {
                        return x;
                    }
                }
            }

            /**
             * Method that evaluates characters.
             */
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
                    if (!eat(')')) {
                        throw new RuntimeException();
                    }
                } else if ((character >= '0' && character <= '9') || character == '.') { // numbers
                    while ((character >= '0' && character <= '9') || character == '.') {
                        nextChar();
                    }
                    x = Double.parseDouble(str.substring(startPosition, this.position));
                } else if (character == '√') { // sqrt
                    nextChar();
                    x = parseFactor();
                    x = Math.sqrt(x);
                } else {
                    throw new RuntimeException();
                }

                if (eat('^')) {
                    x = Math.pow(x, parseFactor()); // exponentiation                                           
                }
                return x;
            }
        }.parse();
    }
}
