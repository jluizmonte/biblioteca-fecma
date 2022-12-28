package com.biblioteca.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author José Luiz
 */
public class GetDateUtil {

    /**
     * retorna dia e mes (separado por hifen) e hora (hora e minutos)
     *
     * @return
     */
    public String getDate() {
        String dataAtual = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM_HH:mm");
        LocalDateTime timepoint = LocalDateTime.now();
        dataAtual = (timepoint.format(fmt));
        return dataAtual;

    }

    /**
     * retorna a data completa (dia ,mês e ano) e a hora atual (hora, minuto e
     * segundos)
     *
     * @return
     */
    public String getDateNow() {
        String date = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
        LocalDateTime timepoint = LocalDateTime.now();
        date = (timepoint.format(fmt));
        return date;
    }

    /**
     * retorna o dia e o mês com um underline
     *
     * @return
     */
    public String getDateOnly() {
        String date = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd_MM");
        LocalDateTime timepoint = LocalDateTime.now();
        date = (timepoint.format(fmt));
        return date;
    }

    /**
     * retorna a hora e minutos
     *
     * @return
     */
    public String getTimeOnly() {
        String date = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("HH:mm");
        LocalDateTime timepoint = LocalDateTime.now();
        date = (timepoint.format(fmt));
        return date;
    }

    /**
     * retorna dia, mês e ano atuais no padrão dd-mm-yyyy
     *
     * @return
     */
    public String setarData() {
        String date = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime timepoint = LocalDateTime.now();
        date = (timepoint.format(fmt));
        return date;
    }

    /**
     * retorna a data atualizada de 1 mês no formato dd-mm-yyyy
     *
     * @return
     */
    public String setarDataFutura() {
        String date = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime timepoint = LocalDateTime.now().plusMonths(1);
        date = (timepoint.format(fmt));
        return date;
    }

    public String setarDataPadraoUs() {
        String date = "";
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime timepoint = LocalDateTime.now();
        date = (timepoint.format(fmt));
        return date;
    }
}
