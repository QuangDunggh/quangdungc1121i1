let tableCaro = '';
let caro = [];
let size = 6;
let isPlayer_X = true;
let isCompleted = false;

for (let i = 0; i < size; i++) {
    caro[i] = [];
    for (let j = 0; j < size; j++) {
        caro[i][j] = 0;
    }
}
tableCaro += '<table border=1>';
for (let i = 0; i < size; i++) {
    tableCaro += '<tr>';
    for (let j = 0; j < size; j++) {
        tableCaro += `<td onclick = 'play(${i},${j})'>${caro[i][j] == 0 ? '&nbsp;&nbsp;' : (caro[i][j] == 1 ? 'X' : 'O')} </td>`
    }
    tableCaro += '</tr>';
}
tableCaro += '</table>';
document.getElementById('tableCaro').innerHTML = tableCaro;
function play(i, j) {
    if (caro[i][j] != 0) {
        alert('Ban da danh o day roi');
        return;
    }
    if (isCompleted) {
        alert('Game is over');
        return;
    }
    if (isPlayer_X) {
        caro[i][j] = 1;
        isPlayer_X = false;
    } else {
        caro[i][j] = 10;
        isPlayer_X = true;
    }
    tableCaro = '';


    tableCaro += '<table border = 1>';
    for (let i = 0; i < size; i++) {
        tableCaro += '<tr>';
        for (let j = 0; j < size; j++) {
            tableCaro += `<td onclick='play(${i},${j})'>${caro[i][j] == 0 ? '&nbsp;&nbsp;' : (caro[i][j] == 1 ? 'X' : 'O')}</td>`
        }
        tableCaro += '</tr>'
    }
    tableCaro += '</table>'
    document.getElementById('tableCaro').innerHTML = tableCaro;
    if (isWin(i, j)) {
        alert(`${isPlayer_X ? 'Player 2 is winner' : 'Player 1 is winner'}`)
        isCompleted = true;
    }
}
function isWin(i, j) {
    let start = 0;
    let end = 0;

    start = j - 2 < 0 ? 0 : j - 2;
    end = j + 2 > size - 1 ? size - 1 : j + 2;
    for (let p = start; p <= end - 2; p++) {
        let total =  caro[size - p - 1][p] + caro[size - p - 1] [p + 1] + caro[size - p - 1][ p + 2];
        return total == 3 || total == 30;
    }
    // for (let i = 0; i < size - 2; i++) {
    //     for (let j = 0; j < size - 2; j++) {
    //         if (caro[i][j] + caro[i + 1][j + 1] + caro[i + 2][j + 2] == 3 || caro[i][j] + caro[i + 1][j + 1] + caro[i + 2][j + 2] == 30) {
    //             return true;
    //             // duong cheo chinh
    //         }
    //     }
    // }
    for (let i = 0; i < size - 2; i++) {
        for (let j = 0; j < size - 2; j++) {
            if (caro[i][j] + caro[i + 1][j] + caro[i + 2][j] == 3 || caro[i][j] + caro[i + 1][j] + caro[i + 2][j] == 30) {
                return true;
            }
            // duong doc
        }
    }
    start = j - 2 < 0 ? 0 : j - 2;
    end = j + 2 > size - 1 ? size - 1 : j + 2;
    for (let p = start; p <= end - 2; p++) {
        let total =  caro[i][p] + caro[i][p + 1] + caro[i][p + 2];
        if (total == 3 || total == 30);
        return true;
        // duong duong ngang
    }

    for (let i = 0; i < size - 2; i++) {
        for (let j = 0; j < size - 2; j++) {
            if (caro[i][j] + caro[i + 1][j - 1] + caro[i + 2][j - 2] == 3 || caro[i][j] + caro[i + 1][j - 1] + caro[i + 2][j - 2] == 30) {
                return true;
                // duong cheo phu
            }
        }
    }

    return false;
}