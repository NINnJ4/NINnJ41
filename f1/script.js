function addPilotosNaTable(pilotosLita, idTabela) {
    const corpoTabela = document.getElementById(idTabela);

    pilotosLita.forEach((piloto, index) => {
        const style = "text-center px-6 py-4 color-red"
        const tr = document.createElement("tr")
        const tdPos = document.createElement("td")
        const tdName = document.createElement("td")
        const tdTeam = document.createElement("td")
        const tdPoints = document.createElement("td")

        tdPos.textContent = index + 1
        tdPos.className =

            tdName.onclick = () => {
                if (tdName.classList.contains('color-red')) {
                    tdName.classList.remove('color-red')
                    tdName.className += ' color-green'
                } else {
                    tdName.classList.remove('color-green')
                    tdName.className += ' color-red'

                }
            }

            tdPos.onclick = () => {
                if (tdPos.classList.contains('color-pink')) {
                    tdPos.classList.remove('color-pink')
                    tdPos.className += ' color-brown'
                } else {
                    tdPos.classList.remove('color-brown')
                    tdPos.className += ' color-pink'
                }
            }

            tdPoints.onclick = () => {
                if (tdPoints.classList.contains('color-blue')) {
                    tdPoints.classList.remove('color-blue')
                    tdPoints.className += ' color-cyan'
                } else {
                    tdPoints.classList.remove('color-cyan')
                    tdPoints.className += ' color-blue'
                }
            }

            tdTeam.onclick = () => {
                if (tdTeam.classList.contains('color-orange')) {
                    tdTeam.classList.remove('color-orange')
                    tdTeam.className += ' color-yellow'
                } else {
                    tdTeam.classList.remove('color-yellow')
                    tdTeam.className += ' color-orange'
                }
            }

        tdName.textContent = piloto.name
        tdName.className = style

        tdTeam.textContent = piloto.team
        tdTeam.className = style

        tdPoints.textContent = piloto.points
        tdPoints.className = style


        tr.appendChild(tdPos)
        tr.appendChild(tdName)
        tr.appendChild(tdTeam)
        tr.appendChild(tdPoints)

        corpoTabela.appendChild(tr)
    });
}

const tabelaPilotos = [
    {
        name: 'Max Verstappen',
        team: 'Red Bull Racing',
        points: 575,
    },
    {
        name: 'Sergio Perez',
        team: 'Red Bull Racing',
        points: 285,
    },
    {
        name: 'Lewis Hamilton',
        team: 'Mercedes',
        points: 234,
    },
    {
        name: 'Fernando Alonso',
        team: 'Aston Martin',
        points: 206,
    },
    {
        name: 'Charles Leclerc',
        team: 'Ferrari',
        points: 206,
    },
    {
        name: 'Lando Norris',
        team: 'McLaren',
        points: 205,
    },
    {
        name: 'Carlos Sainz Jr.',
        team: 'Ferrari',
        points: 200,
    },
    {
        name: 'George Russell',
        team: 'Mercedes',
        points: 175,
    },
    {
        name: 'Oscar Piastri',
        team: 'McLaren',
        points: 97,
    },
    {
        name: 'Lance Stroll',
        team: 'Aston Martin',
        points: 74,
    },
    {
        name: 'Pierre Gasly',
        team: 'Alpine',
        points: 62,
    },
    {
        name: 'Esteban Ocon',
        team: 'Alpine',
        points: 58,
    },
    {
        name: 'Alexander Albon',
        team: 'Williams',
        points: 27,
    },
    {
        name: 'Yuki Tsunoda',
        team: 'AlphaTauri',
        points: 17,
    },
    {
        name: 'Valtteri Bottas',
        team: 'Alfa Romeo',
        points: 10,
    },
    {
        name: 'Nico Hülkenberg',
        team: 'Haas',
        points: 9,
    },
    {
        name: 'Daniel Ricciardo',
        team: 'AlphaTauri',
        points: 6,
    },
    {
        name: 'Guanyu Zhou',
        team: 'Alfa Romeo',
        points: 6,
    },
    {
        name: 'Kevin Magnussen',
        team: 'Haas',
        points: 3,
    },
    {
        name: 'Liam Lawson',
        team: 'AlphaTauri',
        points: 2,
    },
    {
        name: 'Logan Sargeant',
        team: 'Williams',
        points: 1,
    },
    {
        name: 'Nyck de Vries',
        team: 'AlphaTauri',
        points: 0,
    },
];

addPilotosNaTable(tabelaPilotos.sort((a, b) => {
    return b.points - a.points
}), 'corpo-tabela');
