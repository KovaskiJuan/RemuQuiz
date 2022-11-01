package com.example.remuquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> fixaQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        //Dados Questoes 1 - Remuneração Fixa

        final QuestionsList question1 = new QuestionsList("Qual é o salário minimo do Brasil?", "R$: 1.300,00", "R$: 5.258,00", "R$: 1.212,00", "R$: 1.204,68", "R$: 1.212,00", "" );
        final QuestionsList question2 = new QuestionsList("Quantos meses o trabalhador em regime CLT precisa trabalhar para usufluir do Seguro Desemprego??", "6 meses", "3 meses", "1 ano", "Não existe Seguro Desemprego no Brasil", "6 meses", "" );
        final QuestionsList question3 = new QuestionsList("Qual é o valor da hora trabalhada do brasileiro que ganha 1 (UM) salário minímo?", "R$ 40,40", "R$: 100,00", "R$: 10,56", "R$: 5,51", "R$: 5,51", "" );
        final QuestionsList question4 = new QuestionsList("Quantos meses trabalhados são descontados de imposto?", "Eu não pago imposto", "5 meses", "2 meses", "10 meses", "5 meses", "" );
        final QuestionsList question5 = new QuestionsList("Quantos % está a taxa Selic?", "2,75%", "20%", "13,75%", "7,45%", "13,75%", "" );
        final QuestionsList question6 = new QuestionsList("Qual é o tempo minimo para se aposentar por idade no Brasil?", "M = 66 anos | H = 70 anos", "M = 62 anos | H = 75 anos", "M = 62 anos | H = 65 anos", "M = 65 anos | H = 62 anos", "M = 62 anos | H = 65 anos", "" );


        // Add as questões para a lista

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);


        return questionsLists;

    }


    private static List<QuestionsList> varQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        //Dados Questoes 1 - Remuneração Variavel

        final QuestionsList question1 = new QuestionsList("Qual é a porcentagem de desconto do vale transporte?", "Até 6% do salário", "6%", "Sem desconto", "3%", "Até 6% do salário", "" );
        final QuestionsList question2 = new QuestionsList("O que é PLR?", "Participação de Levantamento de Riscos", "Participação de Lucros e Resultados", "Não existe isso", "Participação de Ganhos da Empresa ", "Participação de Lucros e Resultados", "" );
        final QuestionsList question3 = new QuestionsList("Trabalhar sob algum risco eminente é o que?", "Insalubridade", "Regime CLT Normal", "Regime PJ", "Terceiro Contratado", "Insalubridade", "" );
        final QuestionsList question4 = new QuestionsList("Valores como hora extra contam para o calculo do imposto de renda?", "Não", "Talvez", "Jamais", "Sim", "Sim", "" );
        final QuestionsList question5 = new QuestionsList("Qual é a % da primeira faixa do imposto de renda?", "7,5%", "20%", "Isento", "27,5%", "Isento", "" );
        final QuestionsList question6 = new QuestionsList("Qual é a % da última faixa do imposto de renda?", "80%", "22,5%", "27,5%", "28,5%", "27,5%", "" );


        // Add as questões para a lista

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);


        return questionsLists;

    }


    private static List<QuestionsList> benefitsQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        //Dados Questoes 1 - Beneficios

        final QuestionsList question1 = new QuestionsList("Qual é a porcentagem de desconto do vale transporte?", "Até 6% do salário", "6%", "Sem desconto", "3%", "Até 6% do salário", "" );
        final QuestionsList question2 = new QuestionsList("A empresa é responsável pelo meu trajeto Casa X Trabalho?", "Não", "Talvez", "Jamais", "Sim", "Sim", "" );
        final QuestionsList question3 = new QuestionsList("Qual é a porcentagem de desconto do vale transporte?", "Até 6% do salário", "6%", "Sem desconto", "3%", "Até 6% do salário", "" );
        final QuestionsList question4 = new QuestionsList("A empresa é responsável pelo meu trajeto Casa X Trabalho?", "Não", "Talvez", "Jamais", "Sim", "Sim", "" );

        // Add as questões para a lista

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);


        return questionsLists;

    }


    private static List<QuestionsList> explosionQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();


        //Dados Questoes 1 - explosion Mode

        final QuestionsList question1 = new QuestionsList("Qual é a porcentagem de desconto do vale transporte?", "Até 6% do salário", "6%", "Sem desconto", "3%", "Até 6% do salário", "" );
        final QuestionsList question2 = new QuestionsList("A empresa é responsável pelo meu trajeto Casa X Trabalho?", "Não", "Talvez", "Jamais", "Sim", "Sim", "" );
        final QuestionsList question3 = new QuestionsList("Trabalhar sob algum risco eminente é o que?", "Insalubridade", "Regime CLT Normal", "Regime PJ", "Terceiro Contratado", "Insalubridade", "" );
        final QuestionsList question4 = new QuestionsList("Valores como hora extra contam para o calculo do imposto de renda?", "Não", "Talvez", "Jamais", "Sim", "Sim", "" );
        final QuestionsList question5 = new QuestionsList("Qual é a % da primeira faixa do imposto de renda?", "7,5%", "20%", "Isento", "27,5%", "Isento", "" );
        final QuestionsList question6 = new QuestionsList("Quantos meses o trabalhador em regime CLT precisa trabalhar para usufluir do Seguro Desemprego??", "6 meses", "3 meses", "1 ano", "Não existe Seguro Desemprego no Brasil", "6 meses", "" );
        final QuestionsList question7 = new QuestionsList("Qual é o valor da hora trabalhada do brasileiro que ganha 1 (UM) salário minímo?", "R$ 40,40", "R$: 100,00", "R$: 10,56", "R$: 5,51", "R$: 5,51", "" );
        final QuestionsList question8 = new QuestionsList("Quantos meses trabalhados são descontados de imposto?", "Eu não pago imposto", "5 meses", "2 meses", "10 meses", "5 meses", "" );
        final QuestionsList question9 = new QuestionsList("Quantos % está a taxa Selic?", "2,75%", "20%", "13,75%", "7,45%", "13,75%", "" );


        // Add as questões para a lista

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);


        return questionsLists;

    }


    public static List<QuestionsList> getQuestions(String selectedTopicName) {

        switch (selectedTopicName){
            case "fixa":
                return fixaQuestions();
            case "variavel":
                return varQuestions();
            case "beneficios":
                return benefitsQuestions();
            default:
                return explosionQuestions();


        }

    }

}