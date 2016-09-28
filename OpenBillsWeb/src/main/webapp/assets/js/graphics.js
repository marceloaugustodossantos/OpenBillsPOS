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
//function buscarQtdePrefeitosVereadoresporPartido(nomePartido) {
//    alert("Chamou a função");
//    var partido = nomePartido;    
//    var graficoDespesasCandidato = grafico;
//    graficoDespesasCandidato.chart.renderTo = 'container';
//    graficoDespesasCandidato.title.text = "Quantidade de Prefeitos e vereadores do Partido" + partido;
//    var chartDespCand = new Highcharts.Chart(graficoDespesasCandidato);
//    $.get('webresources/despesascandidato/partido/' + partido, function (response) {        
//        var resp = JSON.stringify(response);
//        var data = JSON.parse(resp);                        
//        chartDespCand.series[0].setData(data);
//        alert(data.toString());
//    });
//};
