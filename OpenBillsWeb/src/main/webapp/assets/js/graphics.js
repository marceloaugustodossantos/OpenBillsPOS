
$(function () {

    var graficoDespesasCandidato = grafico;
    graficoDespesasCandidato.chart.renderTo = 'containerDespesasCandidato';
    graficoDespesasCandidato.title.text = "Candidatos com maiores Despesas";
    var chartDespCand = new Highcharts.Chart(graficoDespesasCandidato);

    var graficoReceitasCandidato = grafico;
    graficoReceitasCandidato.chart.renderTo = "containerReceitasCandidato";
    graficoReceitasCandidato.title.text = "Candidatos com maiores Receitas";
    var chartRecCand = new Highcharts.Chart(graficoReceitasCandidato);

    var graficoDespesasComite = grafico;
    graficoDespesasComite.chart.renderTo = "containerDespesasComite";
    graficoReceitasCandidato.title.text = "Comitês com maiores despesas";
    var chartDespComite = new Highcharts.Chart(graficoDespesasComite);

    var graficoReceitasComite = grafico;
    graficoReceitasComite.chart.renderTo = "containerReceitasComite";
    graficoReceitasCandidato.title.text = "Comitês com maiores Receitas";
    var chartRecComite = new Highcharts.Chart(graficoReceitasComite);


    $("#button").click(
            $.get(
                    'webresources/receitascandidato',
                    function (response) {
                        var resp = JSON.stringify(response);
                        var data = JSON.parse(resp);
                        chartDespCand.series[0].setData(data);
                    }
            )
            );
    $("#button").click(
            $.get(
                    'webresources/receitascandidato',
                    function (response) {
                        var resp = JSON.stringify(response);
                        var data = JSON.parse(resp);
                        chartRecCand.series[0].setData(data);
                    }
            )
            );
    $("#button").click(
            $.get(
                    'webresources/receitascandidato',
                    function (response) {
                        var resp = JSON.stringify(response);
                        var data = JSON.parse(resp);
                        chartDespComite.series[0].setData(data);
                    }
            )
            );
    $("#button").click(
            $.get(
                    'webresources/receitascandidato',
                    function (response) {
                        var resp = JSON.stringify(response);
                        var data = JSON.parse(resp);
                        chartRecComite.series[0].setData(data);
                    }
            )
            );


});
