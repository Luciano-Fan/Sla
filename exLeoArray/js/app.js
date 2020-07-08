let nome = "Nome da Locadora";
let genero = ["Terror", "Drama", "Acao", "Infantil"];
let terror = ["O Exorcista", "It: A Coisa", "A Profecia", "1408", "Drácula de Bram Stoker"];
let drama = ["Perfume de Mulher", "O Poderoso Chefão", "Estrelas Além do Tempo", "Gênio Indomável", "Sociedade dos Poetas Mortos"];
let acao = ["Identidade Bourne", "Código de Conduta", "O Novato", "A Soma de Todos os Medos", "Caçada ao Outubro Vermelho"];
let infantil = ["Toy Story", "Hotel Transilvânia", "Space Jam", "Uma Cilada para Roger Rabbit", "Vida de Inseto"];

let arrayGenero = [terror, drama, acao, infantil];



let arrayLocadora = function () {
    console.log(nome);
    for (let i = 0; i < arrayGenero.length; i++) {
        console.log(genero[i]);
        for (let j = 0; j < arrayGenero[i].length; j++) {
            console.log(arrayGenero[i][j]);
        }
    }
}

let arrayDeciToBi = function (numeroDeci) {
    let arrayBits = [];
    flag = true;
    while (flag) {
        arrayBits.push(numeroDeci % 2);
        numeroDeci = Math.floor(numeroDeci / 2);
        if (numeroDeci < 2) {
            arrayBits.push(numeroDeci);
            flag = false;
        }
    }
    for (let i = arrayBits.length - 1; i >= 0; i--) {
        console.log(arrayBits[i]);
    }
}

let arrayConveBase = function (numeroDeci, base) {
    let arrayBits = [];
    let arrayHexa = ["A","B","C","D","E","F"];
    let resto = 0;
    flag = true;
    while (flag) {
        resto = numeroDeci % base;
        numeroDeci = Math.floor(numeroDeci / base);
        if (resto > 9) {
            arrayBits.push(arrayHexa[resto-10]);
        } else {
            arrayBits.push(resto);
        }
        if (numeroDeci < base) {
            arrayBits.push(numeroDeci);
            flag = false;
        }
    }

    for (let i = arrayBits.length - 1; i >= 0; i--) {
        console.log(arrayBits[i]);
    }
}