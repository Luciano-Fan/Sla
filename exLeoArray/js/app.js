let nome = ["Netflix", "Hulu", "Amazon Prime"];
let genero = ["Terror", "Drama", "Acao", "Infantil"];
let terror = ["O Exorcista", "It: A Coisa", "A Profecia", "1408", "Drácula de Bram Stoker"];
let drama = ["Perfume de Mulher", "O Poderoso Chefão", "Estrelas Além do Tempo", "Gênio Indomável", "Sociedade dos Poetas Mortos"];
let acao = ["Identidade Bourne", "Código de Conduta", "O Novato", "A Soma de Todos os Medos", "Caçada ao Outubro Vermelho"];
let infantil = ["Toy Story", "Hotel Transilvânia", "Space Jam", "Uma Cilada para Roger Rabbit", "Vida de Inseto"];

let arrayGenero = [terror, drama, acao, infantil];

let arrayLocadora = function () {
    document.write("<strong> Locadoras </strong>" + "<br>")
    for (let i = 0; i < nome.length; i++) {
        document.write(nome[i] + "<br>")
    }

    for (let i = 0; i < arrayGenero.length; i++) {
        document.write("<hr> <strong>" + genero[i] + "</strong> <br>")

        for (let j = 0; j < arrayGenero[i].length; j++) {
            document.write(arrayGenero[i][j] + "<br>")
        }

    }
}

let arrayDeciToBi = function () {
    let numeroDeci = document.getElementById("decimal1").value
    let arrayBits = [];
    let flag = true;
    
    while (flag) {
        arrayBits.push(numeroDeci % 2);
        numeroDeci = Math.floor(numeroDeci / 2);
        if (numeroDeci < 2) {
            arrayBits.push(numeroDeci);
            flag = false;
        }
    }
    for (let i = arrayBits.length - 1; i >= 0; i--) {
        document.write(arrayBits[i]);
    }
}

let arrayConveBase = function () {
    let numeroDeci = document.getElementById("decimal2").value
    let base = document.getElementById("base").value
    
    let arrayBits = [];
    let arrayHexa = ["A", "B", "C", "D", "E", "F"];
    let resto = 0;
    let flag = true

    if (base == 10) {
        return document.write(10);
    }

    while (flag) {
        resto = numeroDeci % base;
        numeroDeci = Math.floor(numeroDeci / base);
        if (resto > 9) {
            arrayBits.push(arrayHexa[resto - 10]);
        } else {
            arrayBits.push(resto);
        }
        if (numeroDeci < base) {
            arrayBits.push(numeroDeci);
            flag = false;
        }
    }

    for (let i = arrayBits.length - 1; i >= 0; i--) {
        document.write(arrayBits[i]);

    }
}