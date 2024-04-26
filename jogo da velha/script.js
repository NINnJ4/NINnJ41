let currentPlayer = 'X';
let gameActive = true;
let gameState = ['', '', '', '', '', '', '', '', ''];

const winningConditions = [
    [0, 1, 2],
    [3, 4, 5],
    [6, 7, 8],
    [0, 3, 6],
    [1, 4, 7],
    [2, 5, 8],
    [0, 4, 8],
    [2, 4, 6]
];

function cellClicked(cellIndex) {
    if (gameState[cellIndex] === '' && gameActive) {
        gameState[cellIndex] = currentPlayer;
        document.querySelectorAll('.cell')[cellIndex].innerText = currentPlayer;
        if (checkWin()) {
            alert('Jogador ' + currentPlayer + ' ganhou!');
            gameActive = false;
            return;
        }
        if (!gameState.includes('')) {
            alert('Empate!');
            gameActive = false;
            return;
        }
        currentPlayer = currentPlayer === 'X' ? 'O' : 'X';
    }
}

function checkWin() {
    for (let i = 0; i < winningConditions.length; i++) {
        const [a, b, c] = winningConditions[i];
        if (gameState[a] && gameState[a] === gameState[b] && gameState[a] === gameState[c]) {
            return true;
        }
    }
    return false;
}

function resetBoard() {
    currentPlayer = 'X';
    gameActive = true;
    gameState = ['', '', '', '', '', '', '', '', ''];
    document.querySelectorAll('.cell').forEach(cell => cell.innerText = '');
}
