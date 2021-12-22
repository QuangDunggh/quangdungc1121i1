let size = 10;
let caro = [];
let caroTable = "";
let isPlayer_X = true; //player1 = true, player2 = false;
const x_value = 1;
const o_value = 10;
for (let i = 0; i < size; i++) {
    caro[i] = [];
    for (let j = 0; j < size; j++) {
        caro[i][j] = 0;
    }
}
caroTable += "<table border=1>";
for (let i = 0; i < size; i++) {
    caroTable += "<tr>";
    for (let j = 0; j < size; j++) {
        caroTable += `<td class='${caro[i][j] == 0 ? '' : (caro[i][j] == 1 ? "isX" : "isO")}' onclick="play(${i},${j})">
                         ${caro[i][j] == 0 ? '&nbsp;&nbsp;' : (caro[i][j] == 1 ? "X" : "O")}</td>`;
    }
    caroTable += "</tr>";
}
caroTable += "</table>";

document.getElementById("caro").innerHTML = caroTable;

function play(i, j) {
    if (caro[i][j] != 0) {
        alert('Invalid position')
        return;
    }
    if (isPlayer_X) {
        caro[i][j] = x_value;
        isPlayer_X = false;
    }
    else {
        caro[i][j] = o_value;
        isPlayer_X = true;
    }
    caroTable = "";
    caroTable += "<table border=1>";
    for (let i = 0; i < size; i++) {
        caroTable += "<tr>";
        for (let j = 0; j < size; j++) {
            caroTable += `<td class='${caro[i][j] == 0 ? '' : (caro[i][j] == 1 ? "isX" : "isO")}' 
                            onclick="play(${i},${j})">
                                ${caro[i][j] == 0 ? '&nbsp;&nbsp;' : (caro[i][j] == 1 ? "X" : "O")}</td>`;
        }
        caroTable += "</tr>";
    }
    caroTable += "</table>";

    document.getElementById("caro").innerHTML = caroTable;
}

