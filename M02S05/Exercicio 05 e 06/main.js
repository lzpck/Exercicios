//Forma 1
import calculadora from "./calculadora.js";

calculadora.somar(2, 2);
calculadora.subtrair(2, 2);

// Forma 2
import {
    somar,
    subtrair
} from "./calculadora.js";

somar(2, 2);
subtrair(2, 2);