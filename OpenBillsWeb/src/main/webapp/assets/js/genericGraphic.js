

var grafico = {
        chart: {
            renderTo: '',
            type: 'column'
        },
        title: {
            text: ''
        },
        subtitle: {
            text: 'Fonte: <a href="http://dados.gov.br/dataset/prestacao-de-contas-das-campanhas-eleitorais">dados.gov.br</a>'
        },
        xAxis: {
            type: 'category',
            labels: {
                rotation: -45,
                style: {
                    fontSize: '13px',
                    fontFamily: 'Verdana, sans-serif'
                }
            }
        },
        yAxis: {
            min: 0,
            title: {
                text: 'Valor em reais'
            }
        },
        legend: {
            enabled: false
        },
        tooltip: {
            pointFormat: 'Valor em reais: <b>{point.y:f}</b>'
        },
        series: [{
                name: 'Population',
                data: [[]],
                dataLabels: {
                    enabled: true,
                    rotation: -90,
                    color: '#FFFFFF',
                    align: 'right',
                    format: '{point.y:.1f}', // one decimal
                    y: 10, // 10 pixels down from the top
                    style: {
                        fontSize: '13px',
                        fontFamily: 'Verdana, sans-serif'
                    }
                }
            }]
    };