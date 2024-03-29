package com.biblioteca.util;

import java.text.DecimalFormat;

/**
 * Clase conversora de pontos e vírgulas para uso em valores financeiros
 *
 * @author joseluiz
 */
public class MascarasUtil {

    /**
     * converte a virgula de uma string para ponto
     *
     * @param pString pString
     * @return String
     */
    public String converterVirgulaParaPonto(String pString) {
        String retorno = new String();
        int tamanhoString = pString.length();
        for (int i = 0; i < tamanhoString; i++) {
            if (pString.charAt(i) == ',') {
                retorno += '.';
            } else {
                retorno += pString.charAt(i);
            }
        }
        return retorno;
    }

    /**
     * converte a virgula de uma string para ponto
     *
     * @param pString pString
     * @return String
     */
    public String converterPontoPraVirgula(String pString) {
        String retorno = new String();
        int tamanhoString = pString.length();
        for (int i = 0; i < tamanhoString; i++) {
            if (pString.charAt(i) == '.') {
                retorno += ',';
            } else {
                retorno += pString.charAt(i);
            }
        }
        return retorno;
    }

    /**
     * converte a virgula de uma string para ponto
     *
     * @param pString pString
     * @return float
     */
    public float converterVirgulaParaPontoReturnFloat(String pString) {
        String retorno = new String();
        int tamanhoString = pString.length();
        for (int i = 0; i < tamanhoString; i++) {
            if (pString.charAt(i) == ',') {
                retorno += '.';
            } else {
                retorno += pString.charAt(i);
            }
        }
        return Float.parseFloat(retorno);
    }

    /**
     * retira os pontos do valor
     *
     * @param pString pString
     * @return return
     */
    public String removerPontos(String pString) {
        String retorno = new String();
        int tamanhoString = pString.length();
        for (int i = 0; i < tamanhoString; i++) {
            if (pString.charAt(i) == '.') {
                retorno += "";
            } else {
                retorno += pString.charAt(i);
            }
        }
        return retorno;
    }

    /**
     * adiciona um ponto a string
     *
     * @param pString pString
     * @return String
     */
    public String addPonto(String pString) {
        int pontoConter = 0;
        for (int i = 0; i < pString.length(); i++) {
            if (pString.charAt(i) == '.') {
                pontoConter++;
            }
        }
        if (pontoConter == 0) {
            pString += ".0";
        }
        return pString;
    }

    /**
     * truca o valor com 3 casas decimais
     *
     * @param pValor pValor
     * @return double
     */
    public double truncar3Casas(double pValor) {

        return Math.round(pValor * 100) / 100d;
    }

    /**
     *
     * @param pString pString
     * @return return
     */
    public int converteInteiro(int pString) {
        DecimalFormat df = new DecimalFormat("#.0");
        pString = Integer.parseInt(df.format(pString));
        return pString;
    }

    /**
     * Arredonda com 2 casas decimais.
     *
     * @param pDouble pDouble
     * @return return
     */
    public double converteArredondar2Casas(double pDouble) {
        DecimalFormat df = new DecimalFormat("#,00");
        pDouble = Double.parseDouble(df.format(pDouble));
        return pDouble;
    }

    /**
     * arredonda um valor com ponto
     *
     * @param pValor pValor
     * @return return
     */
    public float arredondamentoComPontoDuasCasas(float pValor) {
        DecimalFormat df = new DecimalFormat("#.00");
        return Float.parseFloat(this.converterVirgulaParaPonto(df.format(pValor)));
    }

    /**
     * arredonda um valor com ponto
     *
     * @param pValor pValor
     * @return return
     */
    public Double arredondamentoComPontoDuasCasasDouble(Double pValor) {
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(this.converterVirgulaParaPonto(df.format(pValor)));
    }

    /**
     * arrendonda valores com 3 casas antes da vírgula
     *
     * @param pValor
     * @return
     */
    public Double arrendondamentoComPontoTresCasasDouble(Double pValor) {
        DecimalFormat df = new DecimalFormat("###.00");
        return Double.parseDouble(this.converterVirgulaParaPonto(df.format(pValor)));
    }

    /**
     * arredonda um valor com ponto
     *
     * @param pValor pValor
     * @return return
     */
    public Double arredondamentoComPontoDuasCasasDouble(float pValor) {
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(this.converterVirgulaParaPonto(df.format(pValor)));
    }

    /**
     * arredonda um valor com ponto string formatada
     *
     * @param pValor pValor
     * @return return
     */
    public String arredondamentoComPontoDuasCasasString(double pValor) {
        DecimalFormat df = new DecimalFormat("#.00");
        return this.converterVirgulaParaPonto(df.format(pValor));
    }

    /**
     * arredonda um valor com ponto
     *
     * @param pValor pValor
     * @return return
     */
    public float arredondamentoComPontoTresCasas(float pValor) {
        DecimalFormat df = new DecimalFormat("#.000");
        return Float.parseFloat(this.converterVirgulaParaPonto(df.format(pValor)));
    }

    /**
     * arredonda um valor com ponto
     *
     * @param pValor pValor
     * @return return
     */
    public String arredondamentoDoubleComPontoDuasCasasString(Double pValor) {
        DecimalFormat df = new DecimalFormat("#.00");
        return this.converterVirgulaParaPonto(df.format(pValor));
    }

    /**
     * cria mascara para a matricula para assim poder ter 0 a esquerda recebe a
     * matricula no formato INT e retorna uma String
     *
     * @param matricula
     * @param length
     * @return
     */
    public String criaMascaraMatricula(int matricula, int length) {
        String inputString = String.valueOf(matricula);
        if (inputString.length() >= length) {
            return inputString;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - inputString.length()) {
            sb.append('0');
        }
        sb.append(inputString);

        return sb.toString();
    }
}
