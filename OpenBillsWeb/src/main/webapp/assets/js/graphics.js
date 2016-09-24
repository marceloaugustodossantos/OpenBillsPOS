
function buscarCandidatosPorCidade(nomeCidade) {
    var municipio = nomeCidade;    
    var graficoDespesasCandidato = grafico;
    graficoDespesasCandidato.chart.renderTo = 'container';
    graficoDespesasCandidato.title.text = "Candidatos com maiores Despesas";
    var chartDespCand = new Highcharts.Chart(graficoDespesasCandidato);
    $.get('webresources/despesascandidato/' + nomeCidade, function (response) {        
        var resp = JSON.stringify(response);
        var data = JSON.parse(resp);                        
        chartDespCand.series[0].setData(data);
    });
};
