package com.example.android.marcador;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.android.marcador.R.id.faltasA;
import static com.example.android.marcador.R.id.faltasB;

public class MainActivity extends AppCompatActivity {

    // Programa: marcador de baloncesto.
    // Program: basketball score keeper

    // Variable para el periodo o cuarto
    //For quarter

    int cuarto = 1;

    // Variables para los puntos de los equipos
    // Teams and points

    int puntosEquipoA1 = 0, puntosEquipoA2 = 0, puntosEquipoA3 = 0, puntosEquipoA4 = 0;
    int puntosEquipoB1 = 0, puntosEquipoB2 = 0, puntosEquipoB3 = 0, puntosEquipoB4 = 0;

    // variables para las faltas de los equipos
    // Teams and faults

    int faltasEquipoA1 = 0, faltasEquipoA2 = 0, faltasEquipoA3 = 0, faltasEquipoA4 = 0;
    int faltasEquipoAT1 = 0, faltasEquipoAT2 = 0, faltasEquipoAT3 = 0, faltasEquipoAT4 = 0;
    int faltasEquipoB1 = 0, faltasEquipoB2 = 0, faltasEquipoB3 = 0, faltasEquipoB4 = 0;
    int faltasEquipoBT1 = 0, faltasEquipoBT2 = 0, faltasEquipoBT3 = 0, faltasEquipoBT4 = 0;

    // Variables para los puntos de los jugadores del equipo local
    // Points players home team
    int puntosA4 = 0, puntosA5 = 0, puntosA6 = 0, puntosA7 = 0, puntosA8 = 0, puntosA9 = 0, puntosA10 = 0;
    int puntosA11 = 0, puntosA12 = 0, puntosA13 = 0, puntosA14 = 0, puntosA15 = 0;

    //Variables para las faltas de los jugadores del equipo local
    //Faults players home team

    int faltasA4 = 0, faltasA5 = 0, faltasA6 = 0, faltasA7 = 0, faltasA8 = 0, faltasA9 = 0, faltasA10 = 0;
    int faltasA11 = 0, faltasA12 = 0, faltasA13 = 0, faltasA14 = 0, faltasA15 = 0;

    // Variables para los puntos de los jugadores del equipo visitante
    // Points players visitor team
    int puntosB4 = 0, puntosB5 = 0, puntosB6 = 0, puntosB7 = 0, puntosB8 = 0, puntosB9 = 0, puntosB10 = 0;
    int puntosB11 = 0, puntosB12 = 0, puntosB13 = 0, puntosB14 = 0, puntosB15 = 0;

    //Variables para las faltas de los jugadores del equipo visitante
    //Points players visitor team

    int faltasB4 = 0, faltasB5 =0, faltasB6 = 0, faltasB7 = 0, faltasB8 = 0, faltasB9 = 0, faltasB10 = 0;
    int faltasB11 = 0, faltasB12 = 0, faltasB13 = 0, faltasB14 = 0, faltasB15 = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Fin (View view) {

        //Reinicia las variables.

        // Variable para el periodo o cuarto
        cuarto = 1;

        // Variables para los puntos de los equipos
        puntosEquipoA1 = 0; puntosEquipoA2 = 0; puntosEquipoA3 = 0; puntosEquipoA4 = 0;
        puntosEquipoB1 = 0; puntosEquipoB2 = 0; puntosEquipoB3 = 0; puntosEquipoB4 = 0;

        // variables para las faltas de los equipos
        faltasEquipoA1 = 0; faltasEquipoA2 = 0; faltasEquipoA3 = 0; faltasEquipoA4 = 0;
        faltasEquipoAT1 = 0; faltasEquipoAT2 = 0; faltasEquipoAT3 = 0; faltasEquipoAT4 = 0;
        faltasEquipoB1 = 0; faltasEquipoB2 = 0; faltasEquipoB3 = 0; faltasEquipoB4 = 0;
        faltasEquipoBT1 = 0; faltasEquipoBT2 = 0; faltasEquipoBT3 = 0; faltasEquipoBT4 = 0;

        // Variables para los puntos de los jugadores del equipo local
        puntosA4 = 0; puntosA5 = 0; puntosA6 = 0; puntosA7 = 0; puntosA8 = 0; puntosA9 = 0; puntosA10 = 0;
        puntosA11 = 0; puntosA12 = 0; puntosA13 = 0; puntosA14 = 0; puntosA15 = 0;

        //Variables para las faltas de los jugadores del equipo local

        faltasA4 = 0; faltasA5 = 0; faltasA6 = 0; faltasA7 = 0; faltasA8 = 0; faltasA9 = 0; faltasA10 = 0;
        faltasA11 = 0; faltasA12 = 0; faltasA13 = 0; faltasA14 = 0; faltasA15 = 0;

        // Variables para los puntos de los jugadores del equipo local
        puntosB4 = 0; puntosB5 = 0; puntosB6 = 0; puntosB7 = 0; puntosB8 = 0; puntosB9 = 0; puntosB10 = 0;
        puntosB11 = 0; puntosB12 = 0; puntosB13 = 0; puntosB14 = 0; puntosB15 = 0;

        //Variables para las faltas de los jugadores del equipo visitante;

        faltasB4 = 0; faltasB5 =0; faltasB6 = 0; faltasB7 = 0; faltasB8 = 0; faltasB9 = 0; faltasB10 = 0;
        faltasB11 = 0; faltasB12 = 0; faltasB13 = 0; faltasB14 = 0; faltasB15 = 0;

        // Pone a cero la pantalla


        displayPuntosA(0);
        displayPuntosA4(0);
        displayPuntosA5(0);
        displayPuntosA6(0);
        displayPuntosA7(0);
        displayPuntosA8(0);
        displayPuntosA9(0);
        displayPuntosA10(0);
        displayPuntosA11(0);
        displayPuntosA12(0);
        displayPuntosA13(0);
        displayPuntosA14(0);
        displayPuntosA15(0);
        displayPuntosB(0);
        displayPuntosB4(0);
        displayPuntosB5(0);
        displayPuntosB6(0);
        displayPuntosB7(0);
        displayPuntosB8(0);
        displayPuntosB9(0);
        displayPuntosB10(0);
        displayPuntosB11(0);
        displayPuntosB12(0);
        displayPuntosB13(0);
        displayPuntosB14(0);
        displayPuntosB15(0);
        displayPuntosAPrimerCuarto(0);
        displayPuntosASegundoCuarto(0);
        displayPuntosATercerCuarto(0);
        displayPuntosACuartoCuarto(0);
        displayPuntosBPrimerCuarto(0);
        displayPuntosBSegundoCuarto(0);
        displayPuntosBTercerCuarto(0);
        displayPuntosBCuartoCuarto(0);
        displayFaltasA(0);
        displayFaltasA4(0);
        displayFaltasA5(0);
        displayFaltasA6(0);
        displayFaltasA7(0);
        displayFaltasA8(0);
        displayFaltasA9(0);
        displayFaltasA10(0);
        displayFaltasA11(0);
        displayFaltasA12(0);
        displayFaltasA13(0);
        displayFaltasA14(0);
        displayFaltasA15(0);
        displayFaltasB(0);
        displayFaltasB4(0);
        displayFaltasB5(0);
        displayFaltasB6(0);
        displayFaltasB7(0);
        displayFaltasB8(0);
        displayFaltasB9(0);
        displayFaltasB10(0);
        displayFaltasB11(0);
        displayFaltasB12(0);
        displayFaltasB13(0);
        displayFaltasB14(0);
        displayFaltasB15(0);
        displayCuarto(1);
    }

    //
    /*  Metodo para cambiar de cuarto o periodo
        Method Change quarter
     */

    public void Cuarto(View view) {

        if (cuarto < 4) {
            cuarto = cuarto + 1;
            if (cuarto == 2) {
                displayFaltasA(faltasEquipoA2);
                displayFaltasB(faltasEquipoB2);
                displayCuarto(cuarto);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
            } else if (cuarto == 3) {
                displayFaltasA(faltasEquipoA3);
                displayFaltasB(faltasEquipoB3);
                displayCuarto(cuarto);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
            } else if (cuarto == 4) {
                displayFaltasA(faltasEquipoA4);
                displayFaltasB(faltasEquipoB4);
                displayCuarto(cuarto);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
            }
        } else {
            cuarto = 1;
            displayFaltasA(faltasEquipoA1);
            displayFaltasB(faltasEquipoB1);
            displayCuarto(cuarto);
            displayPuntosA(puntosEquipoA1);
            displayPuntosB(puntosEquipoB2);
        }

    }


    /**
     * Disminuye las faltas de equipo del local
     * Decrease home team faults
     */

    public void faltasAMenos(View view) {

        if (cuarto == 1 && faltasEquipoA1 > 0) {
            displayFaltasA(faltasEquipoA1 = faltasEquipoA1 - 1);
        } else if (cuarto == 2 && faltasEquipoA2 > 0) {
            displayFaltasA(faltasEquipoA2 = faltasEquipoA2 - 1);
        } else if (cuarto == 3 && faltasEquipoA3 > 0) {
            displayFaltasA(faltasEquipoA3 = faltasEquipoA3 - 1);
        } else if (cuarto == 4 && faltasEquipoA4 > 0) {
            displayFaltasA(faltasEquipoA4 = faltasEquipoA4 - 1);
        }
    }

    /**
     * Aumenta las faltas de equipo del local
     * Increase home team faults
     */
    public void faltasAMas(View view) {

        if (cuarto == 1 && faltasEquipoA1 < 5) {
            displayFaltasA(faltasEquipoA1 = faltasEquipoA1 + 1);
        } else if (cuarto == 2 && faltasEquipoA2 < 5) {
            displayFaltasA(faltasEquipoA2 = faltasEquipoA2 + 1);
        } else if (cuarto == 3 && faltasEquipoA3 < 5) {
            displayFaltasA(faltasEquipoA3 = faltasEquipoA3 + 1);
        } else if (cuarto == 4 && faltasEquipoA4 < 5) {
            displayFaltasA(faltasEquipoA4 = faltasEquipoA4 + 1);
        }
    }

    /**
     * Disminuye las faltas de equipo del visitante
     * Decrease visitor team faults
     */
    public void faltasBMenos(View view) {

        if (cuarto == 1 && faltasEquipoB1 > 0) {
            displayFaltasB(faltasEquipoB1 = faltasEquipoB1 - 1);
        } else if (cuarto == 2 && faltasEquipoB2 > 0) {
            displayFaltasB(faltasEquipoB2 = faltasEquipoB2 - 1);
        } else if (cuarto == 3 && faltasEquipoB3 > 0) {
            displayFaltasB(faltasEquipoB3 = faltasEquipoB3 - 1);
        } else if (cuarto == 4 && faltasEquipoB3 > 0) {
            displayFaltasB(faltasEquipoB4 = faltasEquipoB4 - 1);
        }
    }

    /**
     * Aumenta las faltas de equipo del visitante
     * Increase visitor team faults
     */
    public void faltasBMas(View view) {

        if (cuarto == 1 && faltasEquipoB1 < 5) {
            displayFaltasB(faltasEquipoB1 = faltasEquipoB1 + 1);
        } else if (cuarto == 2 && faltasEquipoB2 < 5) {
            displayFaltasB(faltasEquipoB2 = faltasEquipoB2 + 1);
        } else if (cuarto == 3 && faltasEquipoB3 < 5) {
            displayFaltasB(faltasEquipoB3 = faltasEquipoB3 + 1);
        } else if (cuarto == 4 && faltasEquipoB4 < 5) {
            displayFaltasB(faltasEquipoB4 = faltasEquipoB4 + 1);
        }
    }

    /**
     * Aumenta en un punto el marcador del equipo local
     * One more point home team
     */
    public void masUnPuntoA(View view) {
        if (cuarto == 1) {
            puntosEquipoA1 = puntosEquipoA1 + 1;
            displayPuntosAPrimerCuarto(puntosEquipoA1);
            displayPuntosA(puntosEquipoA1);
        } else if (cuarto == 2) {
            puntosEquipoA2 = puntosEquipoA2 + 1;
            displayPuntosASegundoCuarto(puntosEquipoA2);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
        } else if (cuarto == 3) {
            puntosEquipoA3 = puntosEquipoA3 + 1;
            displayPuntosATercerCuarto(puntosEquipoA3);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
        } else if (cuarto == 4) {
            puntosEquipoA4 = puntosEquipoA4 + 1;
            displayPuntosACuartoCuarto(puntosEquipoA4);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
        }
    }

    /**
     * Aumenta en un dos puntos el marcador del equipo local
     * Two more points home team
     */
    public void masDospuntosA(View view) {
        if (cuarto == 1) {
            puntosEquipoA1 = puntosEquipoA1 + 2;
            displayPuntosAPrimerCuarto(puntosEquipoA1);
            displayPuntosA(puntosEquipoA1);
        } else if (cuarto == 2) {
            puntosEquipoA2 = puntosEquipoA2 + 2;
            displayPuntosASegundoCuarto(puntosEquipoA2);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
        } else if (cuarto == 3) {
            displayPuntosATercerCuarto(puntosEquipoA3);
            puntosEquipoA3 = puntosEquipoA3 + 2;
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
        } else if (cuarto == 4) {
            displayPuntosACuartoCuarto(puntosEquipoA4);
            puntosEquipoA4 = puntosEquipoA4 + 2;
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
        }
    }

    /**
     * Aumenta en tres puntos el marcador del equipo local
     * Three more points home team
     */
    public void masTresPuntosA(View view) {

        if (cuarto == 1) {
            puntosEquipoA1 = puntosEquipoA1 + 3;
            displayPuntosAPrimerCuarto(puntosEquipoA1);
            displayPuntosA(puntosEquipoA1);
        } else if (cuarto == 2) {
            puntosEquipoA2 = puntosEquipoA2 + 3;
            displayPuntosASegundoCuarto(puntosEquipoA2);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
        } else if (cuarto == 3) {
            puntosEquipoA3 = puntosEquipoA3 + 3;
            displayPuntosATercerCuarto(puntosEquipoA3);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
        } else if (cuarto == 4) {
            puntosEquipoA4 = puntosEquipoA4 + 3;
            displayPuntosACuartoCuarto(puntosEquipoA4);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
        }
    }


    /**
     * Disminuye en un punto el marcador del equipo local
     * Home team one less point
     */

    public void menosUnPuntoA(View view) {

        if (puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4 > 0) {

            if (cuarto == 1) {
                puntosEquipoA1 = puntosEquipoA1 - 1;
                displayPuntosAPrimerCuarto(puntosEquipoA1);
                displayPuntosA(puntosEquipoA1);
            } else if (cuarto == 2 && puntosEquipoA2 > 0) {
                puntosEquipoA2 = puntosEquipoA2 - 1;
                displayPuntosASegundoCuarto(puntosEquipoA2);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
            } else if (cuarto == 3 && puntosEquipoA3 > 0) {
                puntosEquipoA3 = puntosEquipoA3 - 1;
                displayPuntosATercerCuarto(puntosEquipoA3);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
            } else if (cuarto == 4 && puntosEquipoA4 > 0) {
                puntosEquipoA4 = puntosEquipoA4 - 1;
                displayPuntosACuartoCuarto(puntosEquipoA4);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
            }
        }
    }

    /**
     * Disminuye en un dos puntos el marcador del equipo local
     * Home team two less points
     */
    public void menosDospuntosA(View view) {

        if (puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4 > 1) {

            if (cuarto == 1) {
                puntosEquipoA1 = puntosEquipoA1 - 2;
                displayPuntosAPrimerCuarto(puntosEquipoA1);
                displayPuntosA(puntosEquipoA1);
            } else if (cuarto == 2 && puntosEquipoA2 > 1) {
                puntosEquipoA2 = puntosEquipoA2 - 2;
                displayPuntosASegundoCuarto(puntosEquipoA2);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
            } else if (cuarto == 3 && puntosEquipoA3 > 1) {
                puntosEquipoA3 = puntosEquipoA3 - 2;
                displayPuntosATercerCuarto(puntosEquipoA3);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
            } else if (cuarto == 4 && puntosEquipoA4 > 1) {
                puntosEquipoA4 = puntosEquipoA4 - 2;
                displayPuntosACuartoCuarto(puntosEquipoA4);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
            }
        }
    }

    /**
     * Disminuye en 3 puntos el marcador del equipo local.
     * Three points less home team
     */
    public void menosTresPuntosA(View view) {

        if (puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4 > 2) {

            if (cuarto == 1) {
                puntosEquipoA1 = puntosEquipoA1 - 3;
                displayPuntosAPrimerCuarto(puntosEquipoA1);
                displayPuntosA(puntosEquipoA1);
            } else if (cuarto == 2 && puntosEquipoA2 > 2) {
                puntosEquipoA2 = puntosEquipoA2 - 3;
                displayPuntosASegundoCuarto(puntosEquipoA2);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
            } else if (cuarto == 3 && puntosEquipoA3 > 2) {
                puntosEquipoA3 = puntosEquipoA3 - 3;
                displayPuntosATercerCuarto(puntosEquipoA3);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
            } else if (cuarto == 4 && puntosEquipoA4 > 2) {
                puntosEquipoA4 = puntosEquipoA4 - 3;
                displayPuntosACuartoCuarto(puntosEquipoA4);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
            }
        }
    }

    // Marcador ahora del equipo visitante.


    /**
     * Aumenta en un punto el marcador del equipo visitante.
     * +1 visitor team
     */
    public void masUnPuntoB(View view) {
        if (cuarto == 1) {
            puntosEquipoB1 = puntosEquipoB1 + 1;
            displayPuntosBPrimerCuarto(puntosEquipoB1);
            displayPuntosB(puntosEquipoB1);
        } else if (cuarto == 2) {
            puntosEquipoB2 = puntosEquipoB2 + 1;
            displayPuntosBSegundoCuarto(puntosEquipoB2);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
        } else if (cuarto == 3) {
            puntosEquipoB3 = puntosEquipoB3 + 1;
            displayPuntosBTercerCuarto(puntosEquipoB3);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
        } else if (cuarto == 4) {
            puntosEquipoB4 = puntosEquipoB4 + 1;
            displayPuntosBCuartoCuarto(puntosEquipoB4);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
        }
    }

    /**
     * Aumenta en dos puntos el marcador del equipo visitante.
     * +2 visitor team
     */
    public void masDospuntosB(View view) {
        if (cuarto == 1) {
            puntosEquipoB1 = puntosEquipoB1 + 2;
            displayPuntosBPrimerCuarto(puntosEquipoB1);
            displayPuntosB(puntosEquipoB1);
        } else if (cuarto == 2) {
            puntosEquipoB2 = puntosEquipoB2 + 2;
            displayPuntosBSegundoCuarto(puntosEquipoB2);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
        } else if (cuarto == 3) {
            puntosEquipoB3 = puntosEquipoB3 + 2;
            displayPuntosBTercerCuarto(puntosEquipoB3);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
        } else if (cuarto == 4) {
            puntosEquipoB4 = puntosEquipoB4 + 2;
            displayPuntosBCuartoCuarto(puntosEquipoB4);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
        }
    }

    /**
     * Aumenta en tres puntos el marcador del equipo visitante.
     * +3 visitor team
     */
    public void mastresPuntosB(View view) {

        if (cuarto == 1) {
            puntosEquipoB1 = puntosEquipoB1 + 3;
            displayPuntosBPrimerCuarto(puntosEquipoB1);
            displayPuntosB(puntosEquipoB1);
        } else if (cuarto == 2) {
            puntosEquipoB2 = puntosEquipoB2 + 3;
            displayPuntosBSegundoCuarto(puntosEquipoB2);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
        } else if (cuarto == 3) {
            puntosEquipoB3 = puntosEquipoB3 + 3;
            displayPuntosBTercerCuarto(puntosEquipoB3);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
        } else if (cuarto == 4) {
            puntosEquipoB4 = puntosEquipoB4 + 3;
            displayPuntosBCuartoCuarto(puntosEquipoB4);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
        }
    }

    /**
     * Disminuye en un punto el marcador del equipo visitante
     * -1 visitor team
     */

    public void menosUnPuntoB(View view) {

        if (puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4 > 0) {

            if (cuarto == 1) {
                puntosEquipoB1 = puntosEquipoB1 - 1;
                displayPuntosBPrimerCuarto(puntosEquipoB1);
                displayPuntosB(puntosEquipoB1);
            } else if (cuarto == 2 && puntosEquipoB2 > 0) {
                puntosEquipoB2 = puntosEquipoB2 - 1;
                displayPuntosBSegundoCuarto(puntosEquipoB2);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
            } else if (cuarto == 3 && puntosEquipoB3 > 0) {
                puntosEquipoB3 = puntosEquipoB3 - 1;
                displayPuntosBTercerCuarto(puntosEquipoB3);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
            } else if (cuarto == 4 && puntosEquipoB4 > 0) {
                puntosEquipoB4 = puntosEquipoB4 - 1;
                displayPuntosBCuartoCuarto(puntosEquipoB4);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
            }
        }
    }

    /**
     * Disminuye en dos puntos el marcador del equipo visitante
     * -2 visitor team
     */

    public void menosDosPuntoB(View view) {

        if (puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4 > 1) {

            if (cuarto == 1) {
                puntosEquipoB1 = puntosEquipoB1 - 2;
                displayPuntosBPrimerCuarto(puntosEquipoB1);
                displayPuntosB(puntosEquipoB1);
            } else if (cuarto == 2 && puntosEquipoB2 > 1) {
                puntosEquipoB2 = puntosEquipoB2 - 2;
                displayPuntosBSegundoCuarto(puntosEquipoB2);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
            } else if (cuarto == 3 && puntosEquipoB3 > 1) {
                puntosEquipoB3 = puntosEquipoB3 - 2;
                displayPuntosBTercerCuarto(puntosEquipoB3);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
            } else if (cuarto == 4 && puntosEquipoB4 > 1) {
                puntosEquipoB4 = puntosEquipoB4 - 2;
                displayPuntosBCuartoCuarto(puntosEquipoB4);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
            }
        }
    }

    /**
     * Disminuye en tres puntos el marcador del equipo visitante
     * -2 visitor team
     */

    public void menosTresPuntoB(View view) {

        if (puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4 > 2) {

            if (cuarto == 1) {
                puntosEquipoB1 = puntosEquipoB1 - 3;
                displayPuntosBPrimerCuarto(puntosEquipoB1);
                displayPuntosB(puntosEquipoB1);
            } else if (cuarto == 2 && puntosEquipoB2 > 2) {
                puntosEquipoB2 = puntosEquipoB2 - 3;
                displayPuntosBSegundoCuarto(puntosEquipoB2);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
            } else if (cuarto == 3 && puntosEquipoB3 > 2) {
                puntosEquipoB3 = puntosEquipoB3 - 3;
                displayPuntosBTercerCuarto(puntosEquipoB3);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
            } else if (cuarto == 4 && puntosEquipoB4 > 2) {
                puntosEquipoB4 = puntosEquipoB4 - 3;
                displayPuntosBCuartoCuarto(puntosEquipoB4);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
            }
        }
    }

    //Jugadores del equipo local
    //Points and faults each player, home team

    //  jugador 4 del equipo local

    //Quitar una falta

    public void faltasA4Menos(View view) {

        if (faltasA4 > 0) {
            faltasA4 = faltasA4 - 1;
            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 - 1;
            }

            displayFaltasA4(faltasA4);

            if (cuarto == 1 && faltasEquipoA1 > 0 && faltasEquipoAT1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 - 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 > 0 && faltasEquipoAT2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 - 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 > 0 && faltasEquipoAT3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 - 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 > 0 && faltasEquipoAT4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 - 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Añadir una falta

    public void faltasA4Mas(View view) {

        if (faltasA4 < 5) {
            faltasA4 = faltasA4 + 1;
            displayFaltasA4(faltasA4);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoA1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 + 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 + 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 + 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 + 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Quitar un punto al jugador local 4

    public void puntosA4Menos(View view) {

        if (puntosA4 > 0) {
            puntosA4 = puntosA4 - 1;
            displayPuntosA4(puntosA4);
            if (cuarto == 1 && puntosEquipoA1 > 0) {
                puntosEquipoA1 = puntosEquipoA1 - 1;
                displayPuntosAPrimerCuarto(puntosEquipoA1);
                displayPuntosA(puntosEquipoA1);
            } else if (cuarto == 2 && puntosEquipoA2 > 0) {
                puntosEquipoA2 = puntosEquipoA2 - 1;
                displayPuntosASegundoCuarto(puntosEquipoA2);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
            } else if (cuarto == 3 && puntosEquipoA3 > 0) {
                puntosEquipoA3 = puntosEquipoA3 - 1;
                displayPuntosATercerCuarto(puntosEquipoA3);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
            } else if (cuarto == 4 && puntosEquipoA4 > 0) {
                puntosEquipoA4 = puntosEquipoA4 - 1;
                displayPuntosACuartoCuarto(puntosEquipoA4);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
            }
        }
    }

    //Añadir un punto al jugador local 4

    public void puntosA4Mas(View view) {

        puntosA4 = puntosA4 + 1;
        displayPuntosA4(puntosA4);
        if (cuarto == 1) {
            puntosEquipoA1 = puntosEquipoA1 + 1;
            displayPuntosAPrimerCuarto(puntosEquipoA1);
            displayPuntosA(puntosEquipoA1);
        } else if (cuarto == 2) {
            puntosEquipoA2 = puntosEquipoA2 + 1;
            displayPuntosASegundoCuarto(puntosEquipoA2);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
        } else if (cuarto == 3) {
            puntosEquipoA3 = puntosEquipoA3 + 1;
            displayPuntosATercerCuarto(puntosEquipoA3);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
        } else if (cuarto == 4) {
            puntosEquipoA4 = puntosEquipoA4 + 1;
            displayPuntosACuartoCuarto(puntosEquipoA4);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
        }
    }

    /**
     * Muestra las faltas del jugador 4 del equipo local
     */
    public void displayFaltasA4(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasA4);
        if (faltasA4 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 4 del equipo local
     */
    public void displayPuntosA4(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosA4);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo local

    //Jugador 5 del equipo local

    //Quitar una falta

    public void faltasA5Menos(View view) {

        if (faltasA5 > 0) {
            faltasA5 = faltasA5 - 1;
            displayFaltasA5(faltasA5);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoA1 > 0 && faltasEquipoAT1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 - 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 > 0 && faltasEquipoAT2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 - 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 > 0 && faltasEquipoAT3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 - 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 > 0 && faltasEquipoAT4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 - 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Añadir una falta

    public void faltasA5Mas(View view) {

        if (faltasA5 < 5) {
            faltasA5 = faltasA5 + 1;
            displayFaltasA5(faltasA5);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoA1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 + 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 + 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 + 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 + 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Quitar un punto al jugador local 5

    public void puntosA5Menos(View view) {

        if (puntosA5 > 0) {
            puntosA5 = puntosA5 - 1;
            displayPuntosA5(puntosA5);
            if (cuarto == 1 && puntosEquipoA1 > 0) {
                puntosEquipoA1 = puntosEquipoA1 - 1;
                displayPuntosAPrimerCuarto(puntosEquipoA1);
                displayPuntosA(puntosEquipoA1);
            } else if (cuarto == 2 && puntosEquipoA2 > 0) {
                puntosEquipoA2 = puntosEquipoA2 - 1;
                displayPuntosASegundoCuarto(puntosEquipoA2);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
            } else if (cuarto == 3 && puntosEquipoA3 > 0) {
                puntosEquipoA3 = puntosEquipoA3 - 1;
                displayPuntosATercerCuarto(puntosEquipoA3);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
            } else if (cuarto == 4 && puntosEquipoA4 > 0) {
                puntosEquipoA4 = puntosEquipoA4 - 1;
                displayPuntosACuartoCuarto(puntosEquipoA4);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
            }
        }
    }

    //Añadir un punto al jugador local 5

    public void puntosA5Mas(View view) {

        puntosA5 = puntosA5 + 1;
        displayPuntosA5(puntosA5);
        if (cuarto == 1) {
            puntosEquipoA1 = puntosEquipoA1 + 1;
            displayPuntosAPrimerCuarto(puntosEquipoA1);
            displayPuntosA(puntosEquipoA1);
        } else if (cuarto == 2) {
            puntosEquipoA2 = puntosEquipoA2 + 1;
            displayPuntosASegundoCuarto(puntosEquipoA2);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
        } else if (cuarto == 3) {
            puntosEquipoA3 = puntosEquipoA3 + 1;
            displayPuntosATercerCuarto(puntosEquipoA3);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
        } else if (cuarto == 4) {
            puntosEquipoA4 = puntosEquipoA4 + 1;
            displayPuntosACuartoCuarto(puntosEquipoA4);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
        }
    }


    /**
     * Muestra las faltas del jugador 5 del equipo local
     */
    public void displayFaltasA5(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasA5);
        if (faltasA5 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }


    /**
     * Muestra los puntos del jugador 5 del equipo local
     */
    public void displayPuntosA5(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosA5);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo local

    //  jugador 6 del equipo local

    //Quitar una falta

    public void faltasA6Menos(View view) {

        if (faltasA6 > 0) {
            faltasA6 = faltasA6 - 1;
            displayFaltasA6(faltasA6);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoA1 > 0 && faltasEquipoAT1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 - 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 > 0 && faltasEquipoAT2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 - 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 > 0 && faltasEquipoAT3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 - 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 > 0 && faltasEquipoAT4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 - 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Añadir una falta

    public void faltasA6Mas(View view) {

        if (faltasA6 < 5) {
            faltasA6 = faltasA6 + 1;
            displayFaltasA6(faltasA6);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoA1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 + 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 + 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 + 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 + 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Quitar un punto al jugador local 6

    public void puntosA6Menos(View view) {

        if (puntosA6 > 0) {
            puntosA6 = puntosA6 - 1;
            displayPuntosA6(puntosA6);
            if (cuarto == 1 && puntosEquipoA1 > 0) {
                puntosEquipoA1 = puntosEquipoA1 - 1;
                displayPuntosAPrimerCuarto(puntosEquipoA1);
                displayPuntosA(puntosEquipoA1);
            } else if (cuarto == 2 && puntosEquipoA2 > 0) {
                puntosEquipoA2 = puntosEquipoA2 - 1;
                displayPuntosASegundoCuarto(puntosEquipoA2);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
            } else if (cuarto == 3 && puntosEquipoA3 > 0) {
                puntosEquipoA3 = puntosEquipoA3 - 1;
                displayPuntosATercerCuarto(puntosEquipoA3);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
            } else if (cuarto == 4 && puntosEquipoA4 > 0) {
                puntosEquipoA4 = puntosEquipoA4 - 1;
                displayPuntosACuartoCuarto(puntosEquipoA4);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
            }
        }
    }

    //Añadir un punto al jugador local 6

    public void puntosA6Mas(View view) {

        puntosA6 = puntosA6 + 1;
        displayPuntosA6(puntosA6);
        if (cuarto == 1) {
            puntosEquipoA1 = puntosEquipoA1 + 1;
            displayPuntosAPrimerCuarto(puntosEquipoA1);
            displayPuntosA(puntosEquipoA1);
        } else if (cuarto == 2) {
            puntosEquipoA2 = puntosEquipoA2 + 1;
            displayPuntosASegundoCuarto(puntosEquipoA2);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
        } else if (cuarto == 3) {
            puntosEquipoA3 = puntosEquipoA3 + 1;
            displayPuntosATercerCuarto(puntosEquipoA3);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
        } else if (cuarto == 4) {
            puntosEquipoA4 = puntosEquipoA4 + 1;
            displayPuntosACuartoCuarto(puntosEquipoA4);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
        }
    }

    /**
     * Muestra las faltas del jugador 6 del equipo local
     */
    public void displayFaltasA6(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasA6);
        if (faltasA6 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 6 del equipo local
     */
    public void displayPuntosA6(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosA6);
        scoreView.setText(String.valueOf(score) + "P");
    }

    //Jugadores del equipo local

    //jugador 7 del equipo local

    //Quitar una falta

    public void faltasA7Menos(View view) {

        if (faltasA7 > 0) {
            faltasA7 = faltasA7 - 1;
            displayFaltasA7(faltasA7);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoA1 > 0 && faltasEquipoAT1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 - 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 > 0 && faltasEquipoAT2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 - 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 > 0 && faltasEquipoAT3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 - 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 > 0 && faltasEquipoAT4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 - 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Añadir una falta

    public void faltasA7Mas(View view) {

        if (faltasA7 < 5) {
            faltasA7 = faltasA7 + 1;
            displayFaltasA7(faltasA7);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoA1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 + 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 + 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 + 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 + 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Quitar un punto al jugador local 7

    public void puntosA7Menos(View view) {

        if (puntosA7 > 0) {
            puntosA7 = puntosA7 - 1;
            displayPuntosA7(puntosA7);
            if (cuarto == 1 && puntosEquipoA1 > 0) {
                puntosEquipoA1 = puntosEquipoA1 - 1;
                displayPuntosAPrimerCuarto(puntosEquipoA1);
                displayPuntosA(puntosEquipoA1);
            } else if (cuarto == 2 && puntosEquipoA2 > 0) {
                puntosEquipoA2 = puntosEquipoA2 - 1;
                displayPuntosASegundoCuarto(puntosEquipoA2);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
            } else if (cuarto == 3 && puntosEquipoA3 > 0) {
                puntosEquipoA3 = puntosEquipoA3 - 1;
                displayPuntosATercerCuarto(puntosEquipoA3);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
            } else if (cuarto == 4 && puntosEquipoA4 > 0) {
                puntosEquipoA4 = puntosEquipoA4 - 1;
                displayPuntosACuartoCuarto(puntosEquipoA4);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
            }
        }
    }

    //Añadir un punto al jugador local 7

    public void puntosA7Mas(View view) {

        puntosA7 = puntosA7 + 1;
        displayPuntosA7(puntosA7);
        if (cuarto == 1) {
            puntosEquipoA1 = puntosEquipoA1 + 1;
            displayPuntosAPrimerCuarto(puntosEquipoA1);
            displayPuntosA(puntosEquipoA1);
        } else if (cuarto == 2) {
            puntosEquipoA2 = puntosEquipoA2 + 1;
            displayPuntosASegundoCuarto(puntosEquipoA2);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
        } else if (cuarto == 3) {
            puntosEquipoA3 = puntosEquipoA3 + 1;
            displayPuntosATercerCuarto(puntosEquipoA3);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
        } else if (cuarto == 4) {
            puntosEquipoA4 = puntosEquipoA4 + 1;
            displayPuntosACuartoCuarto(puntosEquipoA4);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
        }
    }

    /**
     * Muestra las faltas del jugador 7 del equipo local
     */
    public void displayFaltasA7(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasA7);
        if (faltasA7 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 7 del equipo local
     */
    public void displayPuntosA7(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosA7);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo local

    //jugador 8 del equipo local

    //Quitar una falta

    public void faltasA8Menos(View view) {

        if (faltasA8 > 0) {
            faltasA8 = faltasA8 - 1;
            displayFaltasA8(faltasA8);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoA1 > 0 && faltasEquipoAT1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 - 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 > 0 && faltasEquipoAT2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 - 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 > 0 && faltasEquipoAT3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 - 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 > 0 && faltasEquipoAT4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 - 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Añadir una falta

    public void faltasA8Mas(View view) {

        if (faltasA8 < 5) {
            faltasA8 = faltasA8 + 1;
            displayFaltasA8(faltasA8);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoA1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 + 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 + 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 + 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 + 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Quitar un punto al jugador local 8

    public void puntosA8Menos(View view) {

        if (puntosA8 > 0) {
            puntosA8 = puntosA8 - 1;
            displayPuntosA8(puntosA8);
            if (cuarto == 1 && puntosEquipoA1 > 0) {
                puntosEquipoA1 = puntosEquipoA1 - 1;
                displayPuntosAPrimerCuarto(puntosEquipoA1);
                displayPuntosA(puntosEquipoA1);
            } else if (cuarto == 2 && puntosEquipoA2 > 0) {
                puntosEquipoA2 = puntosEquipoA2 - 1;
                displayPuntosASegundoCuarto(puntosEquipoA2);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
            } else if (cuarto == 3 && puntosEquipoA3 > 0) {
                puntosEquipoA3 = puntosEquipoA3 - 1;
                displayPuntosATercerCuarto(puntosEquipoA3);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
            } else if (cuarto == 4 && puntosEquipoA4 > 0) {
                puntosEquipoA4 = puntosEquipoA4 - 1;
                displayPuntosACuartoCuarto(puntosEquipoA4);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
            }
        }
    }

    //Añadir un punto al jugador local 8

    public void puntosA8Mas(View view) {

        puntosA8 = puntosA8 + 1;
        displayPuntosA8(puntosA8);
        if (cuarto == 1) {
            puntosEquipoA1 = puntosEquipoA1 + 1;
            displayPuntosAPrimerCuarto(puntosEquipoA1);
            displayPuntosA(puntosEquipoA1);
        } else if (cuarto == 2) {
            puntosEquipoA2 = puntosEquipoA2 + 1;
            displayPuntosASegundoCuarto(puntosEquipoA2);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
        } else if (cuarto == 3) {
            puntosEquipoA3 = puntosEquipoA3 + 1;
            displayPuntosATercerCuarto(puntosEquipoA3);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
        } else if (cuarto == 4) {
            puntosEquipoA4 = puntosEquipoA4 + 1;
            displayPuntosACuartoCuarto(puntosEquipoA4);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
        }
    }

    /**
     * Muestra las faltas del jugador 8 del equipo local
     */
    public void displayFaltasA8(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasA8);
        if (faltasA8 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 8 del equipo local
     */
    public void displayPuntosA8(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosA8);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo local

    //jugador 9 del equipo local

    //Quitar una falta

    public void faltasA9Menos(View view) {

        if (faltasA9 > 0) {
            faltasA9 = faltasA9 - 1;
            displayFaltasA9(faltasA9);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoA1 > 0 && faltasEquipoAT1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 - 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 > 0 && faltasEquipoAT2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 - 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 > 0 && faltasEquipoAT3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 - 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 > 0 && faltasEquipoAT4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 - 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Añadir una falta

    public void faltasA9Mas(View view) {

        if (faltasA9 < 5) {
            faltasA9 = faltasA9 + 1;
            displayFaltasA9(faltasA9);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoA1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 + 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 + 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 + 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 + 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Quitar un punto al jugador local 9

    public void puntosA9Menos(View view) {

        if (puntosA9 > 0) {
            puntosA9 = puntosA9 - 1;
            displayPuntosA9(puntosA9);
            if (cuarto == 1 && puntosEquipoA1 > 0) {
                puntosEquipoA1 = puntosEquipoA1 - 1;
                displayPuntosAPrimerCuarto(puntosEquipoA1);
                displayPuntosA(puntosEquipoA1);
            } else if (cuarto == 2 && puntosEquipoA2 > 0) {
                puntosEquipoA2 = puntosEquipoA2 - 1;
                displayPuntosASegundoCuarto(puntosEquipoA2);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
            } else if (cuarto == 3 && puntosEquipoA3 > 0) {
                puntosEquipoA3 = puntosEquipoA3 - 1;
                displayPuntosATercerCuarto(puntosEquipoA3);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
            } else if (cuarto == 4 && puntosEquipoA4 > 0) {
                puntosEquipoA4 = puntosEquipoA4 - 1;
                displayPuntosACuartoCuarto(puntosEquipoA4);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
            }
        }
    }

    //Añadir un punto al jugador local 9

    public void puntosA9Mas(View view) {

        puntosA9 = puntosA9 + 1;
        displayPuntosA9(puntosA9);
        if (cuarto == 1) {
            puntosEquipoA1 = puntosEquipoA1 + 1;
            displayPuntosAPrimerCuarto(puntosEquipoA1);
            displayPuntosA(puntosEquipoA1);
        } else if (cuarto == 2) {
            puntosEquipoA2 = puntosEquipoA2 + 1;
            displayPuntosASegundoCuarto(puntosEquipoA2);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
        } else if (cuarto == 3) {
            puntosEquipoA3 = puntosEquipoA3 + 1;
            displayPuntosATercerCuarto(puntosEquipoA3);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
        } else if (cuarto == 4) {
            puntosEquipoA4 = puntosEquipoA4 + 1;
            displayPuntosACuartoCuarto(puntosEquipoA4);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
        }
    }

    /**
     * Muestra las faltas del jugador 9 del equipo local
     */

    public void displayFaltasA9(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasA9);
        if (faltasA9 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 9 del equipo local
     */
    public void displayPuntosA9(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosA9);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo local

    //jugador 10 del equipo local

    //Quitar una falta

    public void faltasA10Menos(View view) {

        if (faltasA10 > 0) {
            faltasA10 = faltasA10 - 1;
            displayFaltasA10(faltasA10);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoA1 > 0 && faltasEquipoAT1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 - 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 > 0 && faltasEquipoAT2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 - 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 > 0 && faltasEquipoAT3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 - 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 > 0 && faltasEquipoAT4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 - 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Añadir una falta

    public void faltasA10Mas(View view) {

        if (faltasA10 < 5) {
            faltasA10 = faltasA10 + 1;
            displayFaltasA10(faltasA10);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoA1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 + 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 + 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 + 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 + 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Quitar un punto al jugador local 10

    public void puntosA10Menos(View view) {

        if (puntosA10 > 0) {
            puntosA10 = puntosA10 - 1;
            displayPuntosA10(puntosA10);
            if (cuarto == 1 && puntosEquipoA1 > 0) {
                puntosEquipoA1 = puntosEquipoA1 - 1;
                displayPuntosAPrimerCuarto(puntosEquipoA1);
                displayPuntosA(puntosEquipoA1);
            } else if (cuarto == 2 && puntosEquipoA2 > 0) {
                puntosEquipoA2 = puntosEquipoA2 - 1;
                displayPuntosASegundoCuarto(puntosEquipoA2);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
            } else if (cuarto == 3 && puntosEquipoA3 > 0) {
                puntosEquipoA3 = puntosEquipoA3 - 1;
                displayPuntosATercerCuarto(puntosEquipoA3);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
            } else if (cuarto == 4 && puntosEquipoA4 > 0) {
                puntosEquipoA4 = puntosEquipoA4 - 1;
                displayPuntosACuartoCuarto(puntosEquipoA4);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
            }
        }
    }

    //Añadir un punto al jugador local 10

    public void puntosA10Mas(View view) {

        puntosA10 = puntosA10 + 1;
        displayPuntosA10(puntosA10);
        if (cuarto == 1) {
            puntosEquipoA1 = puntosEquipoA1 + 1;
            displayPuntosAPrimerCuarto(puntosEquipoA1);
            displayPuntosA(puntosEquipoA1);
        } else if (cuarto == 2) {
            puntosEquipoA2 = puntosEquipoA2 + 1;
            displayPuntosASegundoCuarto(puntosEquipoA2);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
        } else if (cuarto == 3) {
            puntosEquipoA3 = puntosEquipoA3 + 1;
            displayPuntosATercerCuarto(puntosEquipoA3);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
        } else if (cuarto == 4) {
            puntosEquipoA4 = puntosEquipoA4 + 1;
            displayPuntosACuartoCuarto(puntosEquipoA4);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
        }
    }

    /**
     * Muestra las faltas del jugador 10 del equipo local
     */
    public void displayFaltasA10(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasA10);
        if (faltasA10 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 10 del equipo local
     */
    public void displayPuntosA10(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosA10);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo local

    //  jugador 11 del equipo local

    //Quitar una falta

    public void faltasA11Menos(View view) {

        if (faltasA11 > 0) {
            faltasA11 = faltasA11 - 1;
            displayFaltasA11(faltasA11);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoA1 > 0 && faltasEquipoAT1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 - 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 > 0 && faltasEquipoAT2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 - 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 > 0 && faltasEquipoAT3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 - 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 > 0 && faltasEquipoAT4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 - 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Añadir una falta

    public void faltasA11Mas(View view) {

        if (faltasA11 < 5) {
            faltasA11 = faltasA11 + 1;
            displayFaltasA11(faltasA11);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoA1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 + 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 + 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 + 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 + 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Quitar un punto al jugador local 11

    public void puntosA11Menos(View view) {

        if (puntosA11 > 0) {
            puntosA11 = puntosA11 - 1;
            displayPuntosA11(puntosA11);
            if (cuarto == 1 && puntosEquipoA1 > 0) {
                puntosEquipoA1 = puntosEquipoA1 - 1;
                displayPuntosAPrimerCuarto(puntosEquipoA1);
                displayPuntosA(puntosEquipoA1);
            } else if (cuarto == 2 && puntosEquipoA2 > 0) {
                puntosEquipoA2 = puntosEquipoA2 - 1;
                displayPuntosASegundoCuarto(puntosEquipoA2);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
            } else if (cuarto == 3 && puntosEquipoA3 > 0) {
                puntosEquipoA3 = puntosEquipoA3 - 1;
                displayPuntosATercerCuarto(puntosEquipoA3);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
            } else if (cuarto == 4 && puntosEquipoA4 > 0) {
                puntosEquipoA4 = puntosEquipoA4 - 1;
                displayPuntosACuartoCuarto(puntosEquipoA4);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
            }
        }
    }

    //Añadir un punto al jugador local 11

    public void puntosA11Mas(View view) {

        puntosA11 = puntosA11 + 1;
        displayPuntosA11(puntosA11);
        if (cuarto == 1) {
            puntosEquipoA1 = puntosEquipoA1 + 1;
            displayPuntosAPrimerCuarto(puntosEquipoA1);
            displayPuntosA(puntosEquipoA1);
        } else if (cuarto == 2) {
            puntosEquipoA2 = puntosEquipoA2 + 1;
            displayPuntosASegundoCuarto(puntosEquipoA2);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
        } else if (cuarto == 3) {
            puntosEquipoA3 = puntosEquipoA3 + 1;
            displayPuntosATercerCuarto(puntosEquipoA3);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
        } else if (cuarto == 4) {
            puntosEquipoA4 = puntosEquipoA4 + 1;
            displayPuntosACuartoCuarto(puntosEquipoA4);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
        }
    }

    /**
     * Muestra las faltas del jugador 11 del equipo local
     */
    public void displayFaltasA11(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasA11);
        if (faltasA11 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 11 del equipo local
     */
    public void displayPuntosA11(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosA11);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo local

    //jugador 12 del equipo local

    //Quitar una falta

    public void faltasA12Menos(View view) {

        if (faltasA12 > 0) {
            faltasA12 = faltasA12 - 1;
            displayFaltasA12(faltasA12);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoA1 > 0 && faltasEquipoAT1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 - 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 > 0 && faltasEquipoAT2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 - 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 > 0 && faltasEquipoAT3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 - 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 > 0 && faltasEquipoAT4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 - 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Añadir una falta

    public void faltasA12Mas(View view) {

        if (faltasA12 < 5) {
            faltasA12 = faltasA12 + 1;
            displayFaltasA12(faltasA12);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoA1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 + 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 + 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 + 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 + 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Quitar un punto al jugador local 12

    public void puntosA12Menos(View view) {

        if (puntosA12 > 0) {
            puntosA12 = puntosA12 - 1;
            displayPuntosA12(puntosA12);
            if (cuarto == 1 && puntosEquipoA1 > 0) {
                puntosEquipoA1 = puntosEquipoA1 - 1;
                displayPuntosAPrimerCuarto(puntosEquipoA1);
                displayPuntosA(puntosEquipoA1);
            } else if (cuarto == 2 && puntosEquipoA2 > 0) {
                puntosEquipoA2 = puntosEquipoA2 - 1;
                displayPuntosASegundoCuarto(puntosEquipoA2);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
            } else if (cuarto == 3 && puntosEquipoA3 > 0) {
                puntosEquipoA3 = puntosEquipoA3 - 1;
                displayPuntosATercerCuarto(puntosEquipoA3);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
            } else if (cuarto == 4 && puntosEquipoA4 > 0) {
                puntosEquipoA4 = puntosEquipoA4 - 1;
                displayPuntosACuartoCuarto(puntosEquipoA4);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
            }
        }
    }

    //Añadir un punto al jugador local 12

    public void puntosA12Mas(View view) {

        puntosA12 = puntosA12 + 1;
        displayPuntosA12(puntosA12);
        if (cuarto == 1) {
            puntosEquipoA1 = puntosEquipoA1 + 1;
            displayPuntosAPrimerCuarto(puntosEquipoA1);
            displayPuntosA(puntosEquipoA1);
        } else if (cuarto == 2) {
            puntosEquipoA2 = puntosEquipoA2 + 1;
            displayPuntosASegundoCuarto(puntosEquipoA2);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
        } else if (cuarto == 3) {
            puntosEquipoA3 = puntosEquipoA3 + 1;
            displayPuntosATercerCuarto(puntosEquipoA3);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
        } else if (cuarto == 4) {
            puntosEquipoA4 = puntosEquipoA4 + 1;
            displayPuntosACuartoCuarto(puntosEquipoA4);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
        }
    }

    /**
     * Muestra las faltas del jugador 12 del equipo local
     */
    public void displayFaltasA12(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasA12);
        if (faltasA12 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 12 del equipo local
     */
    public void displayPuntosA12(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosA12);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo local

    //jugador 13 del equipo local

    //Quitar una falta

    public void faltasA13Menos(View view) {

        if (faltasA13 > 0) {
            faltasA13 = faltasA13 - 1;
            displayFaltasA13(faltasA13);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoA1 > 0 && faltasEquipoAT1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 - 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 > 0 && faltasEquipoAT2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 - 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 > 0 && faltasEquipoAT3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 - 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 > 0 && faltasEquipoAT4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 - 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Añadir una falta

    public void faltasA13Mas(View view) {

        if (faltasA13 < 5) {
            faltasA13 = faltasA13 + 1;
            displayFaltasA13(faltasA13);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoA1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 + 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 + 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 + 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 + 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Quitar un punto al jugador local 13

    public void puntosA13Menos(View view) {

        if (puntosA13 > 0) {
            puntosA13 = puntosA13 - 1;
            displayPuntosA13(puntosA13);
            if (cuarto == 1 && puntosEquipoA1 > 0) {
                puntosEquipoA1 = puntosEquipoA1 - 1;
                displayPuntosAPrimerCuarto(puntosEquipoA1);
                displayPuntosA(puntosEquipoA1);
            } else if (cuarto == 2 && puntosEquipoA2 > 0) {
                puntosEquipoA2 = puntosEquipoA2 - 1;
                displayPuntosASegundoCuarto(puntosEquipoA2);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
            } else if (cuarto == 3 && puntosEquipoA3 > 0) {
                puntosEquipoA3 = puntosEquipoA3 - 1;
                displayPuntosATercerCuarto(puntosEquipoA3);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
            } else if (cuarto == 4 && puntosEquipoA4 > 0) {
                puntosEquipoA4 = puntosEquipoA4 - 1;
                displayPuntosACuartoCuarto(puntosEquipoA4);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
            }
        }
    }

    //Añadir un punto al jugador local 13

    public void puntosA13Mas(View view) {

        puntosA13 = puntosA13 + 1;
        displayPuntosA13(puntosA13);
        if (cuarto == 1) {
            puntosEquipoA1 = puntosEquipoA1 + 1;
            displayPuntosAPrimerCuarto(puntosEquipoA1);
            displayPuntosA(puntosEquipoA1);
        } else if (cuarto == 2) {
            puntosEquipoA2 = puntosEquipoA2 + 1;
            displayPuntosASegundoCuarto(puntosEquipoA2);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
        } else if (cuarto == 3) {
            puntosEquipoA3 = puntosEquipoA3 + 1;
            displayPuntosATercerCuarto(puntosEquipoA3);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
        } else if (cuarto == 4) {
            puntosEquipoA4 = puntosEquipoA4 + 1;
            displayPuntosACuartoCuarto(puntosEquipoA4);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
        }
    }

    /**
     * Muestra las faltas del jugador 13 del equipo local
     */
    public void displayFaltasA13(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasA13);
        if (faltasA13 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 13 del equipo local
     */
    public void displayPuntosA13(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosA13);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo local

    //jugador 14 del equipo local

    //Quitar una falta

    public void faltasA14Menos(View view) {

        if (faltasA14 > 0) {
            faltasA14 = faltasA14 - 1;
            displayFaltasA14(faltasA14);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoA1 > 0 && faltasEquipoAT1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 - 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 > 0 && faltasEquipoAT2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 - 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 > 0 && faltasEquipoAT3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 - 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 > 0 && faltasEquipoAT4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 - 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Añadir una falta

    public void faltasA14Mas(View view) {

        if (faltasA14 < 5) {
            faltasA14 = faltasA14 + 1;
            displayFaltasA14(faltasA14);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoA1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 + 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 + 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 + 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 + 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Quitar un punto al jugador local 14

    public void puntosA14Menos(View view) {

        if (puntosA14 > 0) {
            puntosA14 = puntosA14 - 1;
            displayPuntosA14(puntosA14);
            if (cuarto == 1 && puntosEquipoA1 > 0) {
                puntosEquipoA1 = puntosEquipoA1 - 1;
                displayPuntosAPrimerCuarto(puntosEquipoA1);
                displayPuntosA(puntosEquipoA1);
            } else if (cuarto == 2 && puntosEquipoA2 > 0) {
                puntosEquipoA2 = puntosEquipoA2 - 1;
                displayPuntosASegundoCuarto(puntosEquipoA2);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
            } else if (cuarto == 3 && puntosEquipoA3 > 0) {
                puntosEquipoA3 = puntosEquipoA3 - 1;
                displayPuntosATercerCuarto(puntosEquipoA3);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
            } else if (cuarto == 4 && puntosEquipoA4 > 0) {
                puntosEquipoA4 = puntosEquipoA4 - 1;
                displayPuntosACuartoCuarto(puntosEquipoA4);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
            }
        }
    }

    //Añadir un punto al jugador local 14

    public void puntosA14Mas(View view) {

        puntosA14 = puntosA14 + 1;
        displayPuntosA14(puntosA14);
        if (cuarto == 1) {
            puntosEquipoA1 = puntosEquipoA1 + 1;
            displayPuntosAPrimerCuarto(puntosEquipoA1);
            displayPuntosA(puntosEquipoA1);
        } else if (cuarto == 2) {
            puntosEquipoA2 = puntosEquipoA2 + 1;
            displayPuntosASegundoCuarto(puntosEquipoA2);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
        } else if (cuarto == 3) {
            puntosEquipoA3 = puntosEquipoA3 + 1;
            displayPuntosATercerCuarto(puntosEquipoA3);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
        } else if (cuarto == 4) {
            puntosEquipoA4 = puntosEquipoA4 + 1;
            displayPuntosACuartoCuarto(puntosEquipoA4);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
        }
    }

    /**
     * Muestra las faltas del jugador 14 del equipo local
     */
    public void displayFaltasA14(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasA14);
        if (faltasA14 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 14 del equipo local
     */
    public void displayPuntosA14(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosA14);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo local

    //jugador 15 del equipo local

    //Quitar una falta

    public void faltasA15Menos(View view) {

        if (faltasA15 > 0) {
            faltasA15 = faltasA15 - 1;
            displayFaltasA15(faltasA15);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoA1 > 0 && faltasEquipoAT1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 - 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 > 0 && faltasEquipoAT2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 - 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 > 0 && faltasEquipoAT3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 - 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 > 0 && faltasEquipoAT4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 - 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Añadir una falta

    public void faltasA15Mas(View view) {

        if (faltasA15 < 5) {
            faltasA15 = faltasA15 + 1;
            displayFaltasA15(faltasA15);

            if (cuarto == 1) {
                faltasEquipoAT1 = faltasEquipoAT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoAT2 = faltasEquipoAT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoAT3 = faltasEquipoAT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoAT4 = faltasEquipoAT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoA1 < 5) {
                faltasEquipoA1 = faltasEquipoA1 + 1;
                displayFaltasA(faltasEquipoA1);
            } else if (cuarto == 2 && faltasEquipoA2 < 5) {
                faltasEquipoA2 = faltasEquipoA2 + 1;
                displayFaltasA(faltasEquipoA2);
            } else if (cuarto == 3 && faltasEquipoA3 < 5) {
                faltasEquipoA3 = faltasEquipoA3 + 1;
                displayFaltasA(faltasEquipoA3);
            } else if (cuarto == 4 && faltasEquipoA4 < 5) {
                faltasEquipoA4 = faltasEquipoA4 + 1;
                displayFaltasA(faltasEquipoA4);
            }
        }
    }

    //Quitar un punto al jugador local 15

    public void puntosA15Menos(View view) {

        if (puntosA15 > 0) {
            puntosA15 = puntosA15 - 1;
            displayPuntosA15(puntosA15);
            if (cuarto == 1 && puntosEquipoA1 > 0) {
                puntosEquipoA1 = puntosEquipoA1 - 1;
                displayPuntosAPrimerCuarto(puntosEquipoA1);
                displayPuntosA(puntosEquipoA1);
            } else if (cuarto == 2 && puntosEquipoA2 > 0) {
                puntosEquipoA2 = puntosEquipoA2 - 1;
                displayPuntosASegundoCuarto(puntosEquipoA2);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
            } else if (cuarto == 3 && puntosEquipoA3 > 0) {
                puntosEquipoA3 = puntosEquipoA3 - 1;
                displayPuntosATercerCuarto(puntosEquipoA3);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
            } else if (cuarto == 4 && puntosEquipoA4 > 0) {
                puntosEquipoA4 = puntosEquipoA4 - 1;
                displayPuntosACuartoCuarto(puntosEquipoA4);
                displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
            }
        }
    }

    //Añadir un punto al jugador local 15

    public void puntosA15Mas(View view) {

        puntosA15 = puntosA15 + 1;
        displayPuntosA15(puntosA15);
        if (cuarto == 1) {
            puntosEquipoA1 = puntosEquipoA1 + 1;
            displayPuntosAPrimerCuarto(puntosEquipoA1);
            displayPuntosA(puntosEquipoA1);
        } else if (cuarto == 2) {
            puntosEquipoA2 = puntosEquipoA2 + 1;
            displayPuntosASegundoCuarto(puntosEquipoA2);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2);
        } else if (cuarto == 3) {
            puntosEquipoA3 = puntosEquipoA3 + 1;
            displayPuntosATercerCuarto(puntosEquipoA3);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3);
        } else if (cuarto == 4) {
            puntosEquipoA4 = puntosEquipoA4 + 1;
            displayPuntosACuartoCuarto(puntosEquipoA4);
            displayPuntosA(puntosEquipoA1 + puntosEquipoA2 + puntosEquipoA3 + puntosEquipoA4);
        }
    }

    /**
     * Muestra las faltas del jugador 15 del equipo local
     */
    public void displayFaltasA15(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasA15);
        if (faltasA15 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 15 del equipo local
     */
    public void displayPuntosA15(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosA15);
        scoreView.setText(String.valueOf(score) + "P");
    }

    //------------------------------------------------------------------------------------------

    //Jugadores del equipo visitante
    //Visitor Team, each player

    //jugador 4 del equipo visitante

    //Quitar una falta

    public void faltasB4Menos(View view) {

        if (faltasB4 > 0) {
            faltasB4 = faltasB4 - 1;
            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 - 1;
            }

            displayFaltasB4(faltasB4);

            if (cuarto == 1 && faltasEquipoB1 > 0 && faltasEquipoBT1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 - 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 > 0 && faltasEquipoBT2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 - 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 > 0 && faltasEquipoBT3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 - 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 > 0 && faltasEquipoBT4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 - 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Añadir una falta

    public void faltasB4Mas(View view) {

        if (faltasB4 < 5) {
            faltasB4 = faltasB4 + 1;
            displayFaltasB4(faltasB4);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoB1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 + 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 + 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 + 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 + 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Quitar un punto al jugador local 4

    public void puntosB4Menos(View view) {

        if (puntosB4 > 0) {
            puntosB4 = puntosB4 - 1;
            displayPuntosB4(puntosB4);
            if (cuarto == 1 && puntosEquipoB1 > 0) {
                puntosEquipoB1 = puntosEquipoB1 - 1;
                displayPuntosBPrimerCuarto(puntosEquipoB1);
                displayPuntosB(puntosEquipoB1);
            } else if (cuarto == 2 && puntosEquipoB2 > 0) {
                puntosEquipoB2 = puntosEquipoB2 - 1;
                displayPuntosBSegundoCuarto(puntosEquipoB2);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
            } else if (cuarto == 3 && puntosEquipoB3 > 0) {
                puntosEquipoB3 = puntosEquipoB3 - 1;
                displayPuntosBTercerCuarto(puntosEquipoB3);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
            } else if (cuarto == 4 && puntosEquipoB4 > 0) {
                puntosEquipoB4 = puntosEquipoB4 - 1;
                displayPuntosBCuartoCuarto(puntosEquipoB4);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
            }
        }
    }

    //Añadir un punto al jugador visitante 4

    public void puntosB4Mas(View view) {

        puntosB4 = puntosB4 + 1;
        displayPuntosB4(puntosB4);
        if (cuarto == 1) {
            puntosEquipoB1 = puntosEquipoB1 + 1;
            displayPuntosBPrimerCuarto(puntosEquipoB1);
            displayPuntosB(puntosEquipoB1);
        } else if (cuarto == 2) {
            puntosEquipoB2 = puntosEquipoB2 + 1;
            displayPuntosBSegundoCuarto(puntosEquipoB2);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
        } else if (cuarto == 3) {
            puntosEquipoB3 = puntosEquipoB3 + 1;
            displayPuntosBTercerCuarto(puntosEquipoB3);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
        } else if (cuarto == 4) {
            puntosEquipoB4 = puntosEquipoB4 + 1;
            displayPuntosBCuartoCuarto(puntosEquipoB4);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
        }
    }

    /**
     * Muestra las faltas del jugador 4 del equipo visitante
     */
    public void displayFaltasB4(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasB4);
        if (faltasB4 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 4 del equipo visitante
     */
    public void displayPuntosB4(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosB4);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo visitante

    //jugador 5 del equipo visitante

    //Quitar una falta

    public void faltasB5Menos(View view) {

        if (faltasB5 > 0) {
            faltasB5 = faltasB5 - 1;
            displayFaltasB5(faltasB5);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoB1 > 0 && faltasEquipoBT1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 - 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 > 0 && faltasEquipoBT2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 - 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 > 0 && faltasEquipoBT3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 - 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 > 0 && faltasEquipoBT4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 - 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Añadir una falta

    public void faltasB5Mas(View view) {

        if (faltasB5 < 5) {
            faltasB5 = faltasB5 + 1;
            displayFaltasB5(faltasB5);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoB1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 + 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 + 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 + 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 + 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Quitar un punto al jugador visitante 5

    public void puntosB5Menos(View view) {

        if (puntosB5 > 0) {
            puntosB5 = puntosB5 - 1;
            displayPuntosB5(puntosB5);
            if (cuarto == 1 && puntosEquipoB1 > 0) {
                puntosEquipoB1 = puntosEquipoB1 - 1;
                displayPuntosBPrimerCuarto(puntosEquipoB1);
                displayPuntosB(puntosEquipoB1);
            } else if (cuarto == 2 && puntosEquipoB2 > 0) {
                puntosEquipoB2 = puntosEquipoB2 - 1;
                displayPuntosBSegundoCuarto(puntosEquipoB2);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
            } else if (cuarto == 3 && puntosEquipoB3 > 0) {
                puntosEquipoB3 = puntosEquipoB3 - 1;
                displayPuntosBTercerCuarto(puntosEquipoB3);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
            } else if (cuarto == 4 && puntosEquipoB4 > 0) {
                puntosEquipoB4 = puntosEquipoB4 - 1;
                displayPuntosBCuartoCuarto(puntosEquipoB4);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
            }
        }
    }

    //Añadir un punto al jugador visitante 5

    public void puntosB5Mas(View view) {

        puntosB5 = puntosB5 + 1;
        displayPuntosB5(puntosB5);
        if (cuarto == 1) {
            puntosEquipoB1 = puntosEquipoB1 + 1;
            displayPuntosBPrimerCuarto(puntosEquipoB1);
            displayPuntosB(puntosEquipoB1);
        } else if (cuarto == 2) {
            puntosEquipoB2 = puntosEquipoB2 + 1;
            displayPuntosBSegundoCuarto(puntosEquipoB2);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
        } else if (cuarto == 3) {
            puntosEquipoB3 = puntosEquipoB3 + 1;
            displayPuntosBTercerCuarto(puntosEquipoB3);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
        } else if (cuarto == 4) {
            puntosEquipoB4 = puntosEquipoB4 + 1;
            displayPuntosBCuartoCuarto(puntosEquipoB4);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
        }
    }


    /**
     * Muestra las faltas del jugador 5 del equipo visitante
     */
    public void displayFaltasB5(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasB5);
        if (faltasB5 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }


    /**
     * Muestra los puntos del jugador 5 del equipo visitante
     */
    public void displayPuntosB5(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosB5);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo visitante

    //jugador 6 del equipo visitante

    //Quitar una falta

    public void faltasB6Menos(View view) {

        if (faltasB6 > 0) {
            faltasB6 = faltasB6 - 1;
            displayFaltasB6(faltasB6);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoB1 > 0 && faltasEquipoBT1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 - 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 > 0 && faltasEquipoBT2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 - 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 > 0 && faltasEquipoBT3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 - 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 > 0 && faltasEquipoBT4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 - 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Añadir una falta

    public void faltasB6Mas(View view) {

        if (faltasB6 < 5) {
            faltasB6 = faltasB6 + 1;
            displayFaltasB6(faltasB6);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoB1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 + 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 + 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 + 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 + 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Quitar un punto al jugador visitante 6

    public void puntosB6Menos(View view) {

        if (puntosB6 > 0) {
            puntosB6 = puntosB6 - 1;
            displayPuntosB6(puntosB6);
            if (cuarto == 1 && puntosEquipoB1 > 0) {
                puntosEquipoB1 = puntosEquipoB1 - 1;
                displayPuntosBPrimerCuarto(puntosEquipoB1);
                displayPuntosB(puntosEquipoB1);
            } else if (cuarto == 2 && puntosEquipoB2 > 0) {
                puntosEquipoB2 = puntosEquipoB2 - 1;
                displayPuntosBSegundoCuarto(puntosEquipoB2);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
            } else if (cuarto == 3 && puntosEquipoB3 > 0) {
                puntosEquipoB3 = puntosEquipoB3 - 1;
                displayPuntosBTercerCuarto(puntosEquipoB3);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
            } else if (cuarto == 4 && puntosEquipoB4 > 0) {
                puntosEquipoB4 = puntosEquipoB4 - 1;
                displayPuntosBCuartoCuarto(puntosEquipoB4);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
            }
        }
    }

    //Añadir un punto al jugador visitante 6

    public void puntosB6Mas(View view) {

        puntosB6 = puntosB6 + 1;
        displayPuntosB6(puntosB6);
        if (cuarto == 1) {
            puntosEquipoB1 = puntosEquipoB1 + 1;
            displayPuntosBPrimerCuarto(puntosEquipoB1);
            displayPuntosB(puntosEquipoB1);
        } else if (cuarto == 2) {
            puntosEquipoB2 = puntosEquipoB2 + 1;
            displayPuntosBSegundoCuarto(puntosEquipoB2);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
        } else if (cuarto == 3) {
            puntosEquipoB3 = puntosEquipoB3 + 1;
            displayPuntosBTercerCuarto(puntosEquipoB3);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
        } else if (cuarto == 4) {
            puntosEquipoB4 = puntosEquipoB4 + 1;
            displayPuntosBCuartoCuarto(puntosEquipoB4);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
        }
    }

    /**
     * Muestra las faltas del jugador 6 del equipo visitante
     */
    public void displayFaltasB6(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasB6);
        if (faltasB6 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 6 del equipo visitante
     */
    public void displayPuntosB6(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosB6);
        scoreView.setText(String.valueOf(score) + "P");
    }

    //Jugadores del equipo visitante

    //jugador 7 del equipo visitante

    //Quitar una falta

    public void faltasB7Menos(View view) {

        if (faltasB7 > 0) {
            faltasB7 = faltasB7 - 1;
            displayFaltasB7(faltasB7);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoB1 > 0 && faltasEquipoBT1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 - 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 > 0 && faltasEquipoBT2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 - 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 > 0 && faltasEquipoBT3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 - 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 > 0 && faltasEquipoBT4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 - 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Añadir una falta

    public void faltasB7Mas(View view) {

        if (faltasB7 < 5) {
            faltasB7 = faltasB7 + 1;
            displayFaltasB7(faltasB7);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoB1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 + 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 + 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 + 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 + 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Quitar un punto al jugador visitante 7

    public void puntosB7Menos(View view) {

        if (puntosB7 > 0) {
            puntosB7 = puntosB7 - 1;
            displayPuntosB7(puntosB7);
            if (cuarto == 1 && puntosEquipoB1 > 0) {
                puntosEquipoB1 = puntosEquipoB1 - 1;
                displayPuntosBPrimerCuarto(puntosEquipoB1);
                displayPuntosB(puntosEquipoB1);
            } else if (cuarto == 2 && puntosEquipoB2 > 0) {
                puntosEquipoB2 = puntosEquipoB2 - 1;
                displayPuntosBSegundoCuarto(puntosEquipoB2);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
            } else if (cuarto == 3 && puntosEquipoB3 > 0) {
                puntosEquipoB3 = puntosEquipoB3 - 1;
                displayPuntosBTercerCuarto(puntosEquipoB3);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
            } else if (cuarto == 4 && puntosEquipoB4 > 0) {
                puntosEquipoB4 = puntosEquipoB4 - 1;
                displayPuntosBCuartoCuarto(puntosEquipoB4);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
            }
        }
    }

    //Añadir un punto al jugador visitante 7

    public void puntosB7Mas(View view) {

        puntosB7 = puntosB7 + 1;
        displayPuntosB7(puntosB7);
        if (cuarto == 1) {
            puntosEquipoB1 = puntosEquipoB1 + 1;
            displayPuntosBPrimerCuarto(puntosEquipoB1);
            displayPuntosB(puntosEquipoB1);
        } else if (cuarto == 2) {
            puntosEquipoB2 = puntosEquipoB2 + 1;
            displayPuntosBSegundoCuarto(puntosEquipoB2);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
        } else if (cuarto == 3) {
            puntosEquipoB3 = puntosEquipoB3 + 1;
            displayPuntosBTercerCuarto(puntosEquipoB3);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
        } else if (cuarto == 4) {
            puntosEquipoB4 = puntosEquipoB4 + 1;
            displayPuntosBCuartoCuarto(puntosEquipoB4);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
        }
    }

    /**
     * Muestra las faltas del jugador 7 del equipo visitante
     */
    public void displayFaltasB7(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasB7);
        if (faltasB7 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 7 del equipo visitante
     */
    public void displayPuntosB7(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosB7);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo visitante

    //jugador 8 del equipo visitante

    //Quitar una falta

    public void faltasB8Menos(View view) {

        if (faltasB8 > 0) {
            faltasB8 = faltasB8 - 1;
            displayFaltasB8(faltasB8);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoB1 > 0 && faltasEquipoBT1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 - 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 > 0 && faltasEquipoBT2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 - 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 > 0 && faltasEquipoBT3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 - 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 > 0 && faltasEquipoBT4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 - 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Añadir una falta

    public void faltasB8Mas(View view) {

        if (faltasB8 < 5) {
            faltasB8 = faltasB8 + 1;
            displayFaltasB8(faltasB8);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoB1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 + 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 + 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 + 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 + 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Quitar un punto al jugador visitante 8

    public void puntosB8Menos(View view) {

        if (puntosB8 > 0) {
            puntosB8 = puntosB8 - 1;
            displayPuntosB8(puntosB8);
            if (cuarto == 1 && puntosEquipoB1 > 0) {
                puntosEquipoB1 = puntosEquipoB1 - 1;
                displayPuntosBPrimerCuarto(puntosEquipoB1);
                displayPuntosB(puntosEquipoB1);
            } else if (cuarto == 2 && puntosEquipoB2 > 0) {
                puntosEquipoB2 = puntosEquipoB2 - 1;
                displayPuntosBSegundoCuarto(puntosEquipoB2);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
            } else if (cuarto == 3 && puntosEquipoB3 > 0) {
                puntosEquipoB3 = puntosEquipoB3 - 1;
                displayPuntosBTercerCuarto(puntosEquipoB3);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
            } else if (cuarto == 4 && puntosEquipoB4 > 0) {
                puntosEquipoB4 = puntosEquipoB4 - 1;
                displayPuntosBCuartoCuarto(puntosEquipoB4);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
            }
        }
    }

    //Añadir un punto al jugador visitante 8

    public void puntosB8Mas(View view) {

        puntosB8 = puntosB8 + 1;
        displayPuntosB8(puntosB8);
        if (cuarto == 1) {
            puntosEquipoB1 = puntosEquipoB1 + 1;
            displayPuntosBPrimerCuarto(puntosEquipoB1);
            displayPuntosB(puntosEquipoB1);
        } else if (cuarto == 2) {
            puntosEquipoB2 = puntosEquipoB2 + 1;
            displayPuntosBSegundoCuarto(puntosEquipoB2);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
        } else if (cuarto == 3) {
            puntosEquipoB3 = puntosEquipoB3 + 1;
            displayPuntosBTercerCuarto(puntosEquipoB3);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
        } else if (cuarto == 4) {
            puntosEquipoB4 = puntosEquipoB4 + 1;
            displayPuntosBCuartoCuarto(puntosEquipoB4);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
        }
    }

    /**
     * Muestra las faltas del jugador 8 del equipo visitante
     */
    public void displayFaltasB8(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasB8);
        if (faltasB8 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 8 del equipo visitante
     */
    public void displayPuntosB8(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosB8);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo visitante

    //jugador 9 del equipo visitante

    //Quitar una falta

    public void faltasB9Menos(View view) {

        if (faltasB9 > 0) {
            faltasB9 = faltasB9 - 1;
            displayFaltasB9(faltasB9);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoB1 > 0 && faltasEquipoBT1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 - 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 > 0 && faltasEquipoBT2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 - 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 > 0 && faltasEquipoBT3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 - 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 > 0 && faltasEquipoBT4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 - 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Añadir una falta

    public void faltasB9Mas(View view) {

        if (faltasB9 < 5) {
            faltasB9 = faltasB9 + 1;
            displayFaltasB9(faltasB9);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoB1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 + 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 + 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 + 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 + 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Quitar un punto al jugador visitante 9

    public void puntosB9Menos(View view) {

        if (puntosB9 > 0) {
            puntosB9 = puntosB9 - 1;
            displayPuntosB9(puntosB9);
            if (cuarto == 1 && puntosEquipoB1 > 0) {
                puntosEquipoB1 = puntosEquipoB1 - 1;
                displayPuntosBPrimerCuarto(puntosEquipoB1);
                displayPuntosB(puntosEquipoB1);
            } else if (cuarto == 2 && puntosEquipoB2 > 0) {
                puntosEquipoB2 = puntosEquipoB2 - 1;
                displayPuntosBSegundoCuarto(puntosEquipoB2);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
            } else if (cuarto == 3 && puntosEquipoB3 > 0) {
                puntosEquipoB3 = puntosEquipoB3 - 1;
                displayPuntosBTercerCuarto(puntosEquipoB3);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
            } else if (cuarto == 4 && puntosEquipoB4 > 0) {
                puntosEquipoB4 = puntosEquipoB4 - 1;
                displayPuntosBCuartoCuarto(puntosEquipoB4);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
            }
        }
    }

    //Añadir un punto al jugador visitante 9

    public void puntosB9Mas(View view) {

        puntosB9 = puntosB9 + 1;
        displayPuntosB9(puntosB9);
        if (cuarto == 1) {
            puntosEquipoB1 = puntosEquipoB1 + 1;
            displayPuntosBPrimerCuarto(puntosEquipoB1);
            displayPuntosB(puntosEquipoB1);
        } else if (cuarto == 2) {
            puntosEquipoB2 = puntosEquipoB2 + 1;
            displayPuntosBSegundoCuarto(puntosEquipoB2);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
        } else if (cuarto == 3) {
            puntosEquipoB3 = puntosEquipoB3 + 1;
            displayPuntosBTercerCuarto(puntosEquipoB3);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
        } else if (cuarto == 4) {
            puntosEquipoB4 = puntosEquipoB4 + 1;
            displayPuntosBCuartoCuarto(puntosEquipoB4);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
        }
    }

    /**
     * Muestra las faltas del jugador 9 del equipo visitante
     */
    public void displayFaltasB9(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasB9);
        if (faltasB9 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 9 del equipo visitante
     */
    public void displayPuntosB9(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosB9);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo visitante

    //jugador 10 del equipo visitante

    //Quitar una falta

    public void faltasB10Menos(View view) {

        if (faltasB10 > 0) {
            faltasB10 = faltasB10 - 1;
            displayFaltasB10(faltasB10);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoB1 > 0 && faltasEquipoBT1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 - 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 > 0 && faltasEquipoBT2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 - 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 > 0 && faltasEquipoBT3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 - 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 > 0 && faltasEquipoBT4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 - 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Añadir una falta

    public void faltasB10Mas(View view) {

        if (faltasB10 < 5) {
            faltasB10 = faltasB10 + 1;
            displayFaltasB10(faltasB10);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoB1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 + 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 + 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 + 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 + 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Quitar un punto al jugador visitante 10

    public void puntosB10Menos(View view) {

        if (puntosB10 > 0) {
            puntosB10 = puntosB10 - 1;
            displayPuntosB10(puntosB10);
            if (cuarto == 1 && puntosEquipoB1 > 0) {
                puntosEquipoB1 = puntosEquipoB1 - 1;
                displayPuntosBPrimerCuarto(puntosEquipoB1);
                displayPuntosB(puntosEquipoB1);
            } else if (cuarto == 2 && puntosEquipoB2 > 0) {
                puntosEquipoB2 = puntosEquipoB2 - 1;
                displayPuntosBSegundoCuarto(puntosEquipoB2);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
            } else if (cuarto == 3 && puntosEquipoB3 > 0) {
                puntosEquipoB3 = puntosEquipoB3 - 1;
                displayPuntosBTercerCuarto(puntosEquipoB3);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
            } else if (cuarto == 4 && puntosEquipoB4 > 0) {
                puntosEquipoB4 = puntosEquipoB4 - 1;
                displayPuntosBCuartoCuarto(puntosEquipoB4);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
            }
        }
    }

    //Añadir un punto al jugador visitante 10

    public void puntosB10Mas(View view) {

        puntosB10 = puntosB10 + 1;
        displayPuntosB10(puntosB10);
        if (cuarto == 1) {
            puntosEquipoB1 = puntosEquipoB1 + 1;
            displayPuntosBPrimerCuarto(puntosEquipoB1);
            displayPuntosB(puntosEquipoB1);
        } else if (cuarto == 2) {
            puntosEquipoB2 = puntosEquipoB2 + 1;
            displayPuntosBSegundoCuarto(puntosEquipoB2);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
        } else if (cuarto == 3) {
            puntosEquipoB3 = puntosEquipoB3 + 1;
            displayPuntosBTercerCuarto(puntosEquipoB3);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
        } else if (cuarto == 4) {
            puntosEquipoB4 = puntosEquipoB4 + 1;
            displayPuntosBCuartoCuarto(puntosEquipoB4);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
        }
    }

    /**
     * Muestra las faltas del jugador 10 del equipo visitante
     */
    public void displayFaltasB10(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasB10);
        if (faltasB10 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 10 del equipo visitante
     */
    public void displayPuntosB10(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosB10);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo visitante

    //jugador 11 del equipo visitante

    //Quitar una falta

    public void faltasB11Menos(View view) {

        if (faltasB11 > 0) {
            faltasB11 = faltasB11 - 1;
            displayFaltasB11(faltasB11);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoB1 > 0 && faltasEquipoBT1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 - 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 > 0 && faltasEquipoBT2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 - 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 > 0 && faltasEquipoBT3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 - 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 > 0 && faltasEquipoBT4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 - 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Añadir una falta

    public void faltasB11Mas(View view) {

        if (faltasB11 < 5) {
            faltasB11 = faltasB11 + 1;
            displayFaltasB11(faltasB11);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoB1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 + 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 + 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 + 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 + 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Quitar un punto al jugador visitante 11

    public void puntosB11Menos(View view) {

        if (puntosB11 > 0) {
            puntosB11 = puntosB11 - 1;
            displayPuntosB11(puntosB11);
            if (cuarto == 1 && puntosEquipoB1 > 0) {
                puntosEquipoB1 = puntosEquipoB1 - 1;
                displayPuntosBPrimerCuarto(puntosEquipoB1);
                displayPuntosB(puntosEquipoB1);
            } else if (cuarto == 2 && puntosEquipoB2 > 0) {
                puntosEquipoB2 = puntosEquipoB2 - 1;
                displayPuntosBSegundoCuarto(puntosEquipoB2);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
            } else if (cuarto == 3 && puntosEquipoB3 > 0) {
                puntosEquipoB3 = puntosEquipoB3 - 1;
                displayPuntosBTercerCuarto(puntosEquipoB3);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
            } else if (cuarto == 4 && puntosEquipoB4 > 0) {
                puntosEquipoB4 = puntosEquipoB4 - 1;
                displayPuntosBCuartoCuarto(puntosEquipoB4);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
            }
        }
    }

    //Añadir un punto al jugador visitante 11

    public void puntosB11Mas(View view) {

        puntosB11 = puntosB11 + 1;
        displayPuntosB11(puntosB11);
        if (cuarto == 1) {
            puntosEquipoB1 = puntosEquipoB1 + 1;
            displayPuntosBPrimerCuarto(puntosEquipoB1);
            displayPuntosB(puntosEquipoB1);
        } else if (cuarto == 2) {
            puntosEquipoB2 = puntosEquipoB2 + 1;
            displayPuntosBSegundoCuarto(puntosEquipoB2);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
        } else if (cuarto == 3) {
            puntosEquipoB3 = puntosEquipoB3 + 1;
            displayPuntosBTercerCuarto(puntosEquipoB3);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
        } else if (cuarto == 4) {
            puntosEquipoB4 = puntosEquipoB4 + 1;
            displayPuntosBCuartoCuarto(puntosEquipoB4);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
        }
    }

    /**
     * Muestra las faltas del jugador 11 del equipo visitante
     */
    public void displayFaltasB11(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasB11);
        if (faltasB11 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 11 del equipo visitante
     */
    public void displayPuntosB11(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosB11);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo visitante

    //jugador 12 del equipo visitante

    //Quitar una falta

    public void faltasB12Menos(View view) {

        if (faltasB12 > 0) {
            faltasB12 = faltasB12 - 1;
            displayFaltasB12(faltasB12);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoB1 > 0 && faltasEquipoBT1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 - 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 > 0 && faltasEquipoBT2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 - 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 > 0 && faltasEquipoBT3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 - 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 > 0 && faltasEquipoBT4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 - 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Añadir una falta

    public void faltasB12Mas(View view) {

        if (faltasB12 < 5) {
            faltasB12 = faltasB12 + 1;
            displayFaltasB12(faltasB12);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoB1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 + 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 + 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 + 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 + 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Quitar un punto al jugador visitante 12

    public void puntosB12Menos(View view) {

        if (puntosB12 > 0) {
            puntosB12 = puntosB12 - 1;
            displayPuntosB12(puntosB12);
            if (cuarto == 1 && puntosEquipoB1 > 0) {
                puntosEquipoB1 = puntosEquipoB1 - 1;
                displayPuntosBPrimerCuarto(puntosEquipoB1);
                displayPuntosB(puntosEquipoB1);
            } else if (cuarto == 2 && puntosEquipoB2 > 0) {
                puntosEquipoB2 = puntosEquipoB2 - 1;
                displayPuntosBSegundoCuarto(puntosEquipoB2);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
            } else if (cuarto == 3 && puntosEquipoB3 > 0) {
                puntosEquipoB3 = puntosEquipoB3 - 1;
                displayPuntosBTercerCuarto(puntosEquipoB3);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
            } else if (cuarto == 4 && puntosEquipoB4 > 0) {
                puntosEquipoB4 = puntosEquipoB4 - 1;
                displayPuntosBCuartoCuarto(puntosEquipoB4);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
            }
        }
    }

    //Añadir un punto al jugador visitante 12

    public void puntosB12Mas(View view) {

        puntosB12 = puntosB12 + 1;
        displayPuntosB12(puntosB12);
        if (cuarto == 1) {
            puntosEquipoB1 = puntosEquipoB1 + 1;
            displayPuntosBPrimerCuarto(puntosEquipoB1);
            displayPuntosB(puntosEquipoB1);
        } else if (cuarto == 2) {
            puntosEquipoB2 = puntosEquipoB2 + 1;
            displayPuntosBSegundoCuarto(puntosEquipoB2);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
        } else if (cuarto == 3) {
            puntosEquipoB3 = puntosEquipoB3 + 1;
            displayPuntosBTercerCuarto(puntosEquipoB3);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
        } else if (cuarto == 4) {
            puntosEquipoB4 = puntosEquipoB4 + 1;
            displayPuntosBCuartoCuarto(puntosEquipoB4);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
        }
    }

    /**
     * Muestra las faltas del jugador 12 del equipo visitante
     */
    public void displayFaltasB12(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasB12);
        if (faltasB12 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 12 del equipo visitante
     */
    public void displayPuntosB12(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosB12);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo visitante

    //jugador 13 del equipo visitante

    //Quitar una falta

    public void faltasB13Menos(View view) {

        if (faltasB13 > 0) {
            faltasB13 = faltasB13 - 1;
            displayFaltasB13(faltasB13);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoB1 > 0 && faltasEquipoBT1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 - 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 > 0 && faltasEquipoBT2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 - 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 > 0 && faltasEquipoBT3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 - 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 > 0 && faltasEquipoBT4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 - 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Añadir una falta

    public void faltasB13Mas(View view) {

        if (faltasB13 < 5) {
            faltasB13 = faltasB13 + 1;
            displayFaltasB13(faltasB13);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoB1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 + 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 + 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 + 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 + 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Quitar un punto al jugador visitante 13

    public void puntosB13Menos(View view) {

        if (puntosB13 > 0) {
            puntosB13 = puntosB13 - 1;
            displayPuntosB13(puntosB13);
            if (cuarto == 1 && puntosEquipoB1 > 0) {
                puntosEquipoB1 = puntosEquipoB1 - 1;
                displayPuntosBPrimerCuarto(puntosEquipoB1);
                displayPuntosB(puntosEquipoB1);
            } else if (cuarto == 2 && puntosEquipoB2 > 0) {
                puntosEquipoB2 = puntosEquipoB2 - 1;
                displayPuntosBSegundoCuarto(puntosEquipoB2);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
            } else if (cuarto == 3 && puntosEquipoB3 > 0) {
                puntosEquipoB3 = puntosEquipoB3 - 1;
                displayPuntosBTercerCuarto(puntosEquipoB3);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
            } else if (cuarto == 4 && puntosEquipoB4 > 0) {
                puntosEquipoB4 = puntosEquipoB4 - 1;
                displayPuntosBCuartoCuarto(puntosEquipoB4);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
            }
        }
    }

    //Añadir un punto al jugador visitante 13

    public void puntosB13Mas(View view) {

        puntosB13 = puntosB13 + 1;
        displayPuntosB13(puntosB13);
        if (cuarto == 1) {
            puntosEquipoB1 = puntosEquipoB1 + 1;
            displayPuntosBPrimerCuarto(puntosEquipoB1);
            displayPuntosB(puntosEquipoB1);
        } else if (cuarto == 2) {
            puntosEquipoB2 = puntosEquipoB2 + 1;
            displayPuntosBSegundoCuarto(puntosEquipoB2);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
        } else if (cuarto == 3) {
            puntosEquipoB3 = puntosEquipoB3 + 1;
            displayPuntosBTercerCuarto(puntosEquipoB3);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
        } else if (cuarto == 4) {
            puntosEquipoB4 = puntosEquipoB4 + 1;
            displayPuntosBCuartoCuarto(puntosEquipoB4);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
        }
    }

    /**
     * Muestra las faltas del jugador 13 del equipo visitante
     */
    public void displayFaltasB13(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasB13);
        if (faltasB13 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 13 del equipo visitante
     */
    public void displayPuntosB13(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosB13);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo visitante

    //jugador 14 del equipo visitante

    //Quitar una falta

    public void faltasB14Menos(View view) {

        if (faltasB14 > 0) {
            faltasB14 = faltasB14 - 1;
            displayFaltasB14(faltasB14);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoB1 > 0 && faltasEquipoBT1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 - 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 > 0 && faltasEquipoBT2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 - 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 > 0 && faltasEquipoBT3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 - 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 > 0 && faltasEquipoBT4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 - 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Añadir una falta

    public void faltasB14Mas(View view) {

        if (faltasB14 < 5) {
            faltasB14 = faltasB14 + 1;
            displayFaltasB14(faltasB14);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoB1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 + 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 + 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 + 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 + 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Quitar un punto al jugador visitante 14

    public void puntosB14Menos(View view) {

        if (puntosB14 > 0) {
            puntosB14 = puntosB14 - 1;
            displayPuntosB14(puntosB14);
            if (cuarto == 1 && puntosEquipoB1 > 0) {
                puntosEquipoB1 = puntosEquipoB1 - 1;
                displayPuntosBPrimerCuarto(puntosEquipoB1);
                displayPuntosB(puntosEquipoB1);
            } else if (cuarto == 2 && puntosEquipoB2 > 0) {
                puntosEquipoB2 = puntosEquipoB2 - 1;
                displayPuntosBSegundoCuarto(puntosEquipoB2);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
            } else if (cuarto == 3 && puntosEquipoB3 > 0) {
                puntosEquipoB3 = puntosEquipoB3 - 1;
                displayPuntosBTercerCuarto(puntosEquipoB3);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
            } else if (cuarto == 4 && puntosEquipoB4 > 0) {
                puntosEquipoB4 = puntosEquipoB4 - 1;
                displayPuntosBCuartoCuarto(puntosEquipoB4);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
            }
        }
    }

    //Añadir un punto al jugador visitante 14

    public void puntosB14Mas(View view) {

        puntosB14 = puntosB14 + 1;
        displayPuntosB14(puntosB14);
        if (cuarto == 1) {
            puntosEquipoB1 = puntosEquipoB1 + 1;
            displayPuntosBPrimerCuarto(puntosEquipoB1);
            displayPuntosB(puntosEquipoB1);
        } else if (cuarto == 2) {
            puntosEquipoB2 = puntosEquipoB2 + 1;
            displayPuntosBSegundoCuarto(puntosEquipoB2);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
        } else if (cuarto == 3) {
            puntosEquipoB3 = puntosEquipoB3 + 1;
            displayPuntosBTercerCuarto(puntosEquipoB3);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
        } else if (cuarto == 4) {
            puntosEquipoB4 = puntosEquipoB4 + 1;
            displayPuntosBCuartoCuarto(puntosEquipoB4);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
        }
    }

    /**
     * Muestra las faltas del jugador 14 del equipo visitante
     */
    public void displayFaltasB14(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasB14);
        if (faltasB14 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 14 del equipo visitante
     */
    public void displayPuntosB14(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosB14);
        scoreView.setText(String.valueOf(score) + "P");
    }


    //Jugadores del equipo visitante

    //jugador 15 del equipo visitante

    //Quitar una falta

    public void faltasB15Menos(View view) {

        if (faltasB15 > 0) {
            faltasB15 = faltasB15 - 1;
            displayFaltasB15(faltasB15);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 - 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 - 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 - 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 - 1;
            }

            if (cuarto == 1 && faltasEquipoB1 > 0 && faltasEquipoBT1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 - 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 > 0 && faltasEquipoBT2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 - 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 > 0 && faltasEquipoBT3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 - 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 > 0 && faltasEquipoBT4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 - 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Añadir una falta

    public void faltasB15Mas(View view) {

        if (faltasB15 < 5) {
            faltasB15 = faltasB15 + 1;
            displayFaltasB15(faltasB15);

            if (cuarto == 1) {
                faltasEquipoBT1 = faltasEquipoBT1 + 1;
            } else if (cuarto == 2) {
                faltasEquipoBT2 = faltasEquipoBT2 + 1;
            } else if (cuarto == 3) {
                faltasEquipoBT3 = faltasEquipoBT3 + 1;
            } else if (cuarto == 4) {
                faltasEquipoBT4 = faltasEquipoBT4 + 1;
            }

            if (cuarto == 1 && faltasEquipoB1 < 5) {
                faltasEquipoB1 = faltasEquipoB1 + 1;
                displayFaltasB(faltasEquipoB1);
            } else if (cuarto == 2 && faltasEquipoB2 < 5) {
                faltasEquipoB2 = faltasEquipoB2 + 1;
                displayFaltasB(faltasEquipoB2);
            } else if (cuarto == 3 && faltasEquipoB3 < 5) {
                faltasEquipoB3 = faltasEquipoB3 + 1;
                displayFaltasB(faltasEquipoB3);
            } else if (cuarto == 4 && faltasEquipoB4 < 5) {
                faltasEquipoB4 = faltasEquipoB4 + 1;
                displayFaltasB(faltasEquipoB4);
            }
        }
    }

    //Quitar un punto al jugador visitante 15

    public void puntosB15Menos(View view) {

        if (puntosB15 > 0) {
            puntosB15 = puntosB15 - 1;
            displayPuntosB15(puntosB15);
            if (cuarto == 1 && puntosEquipoB1 > 0) {
                puntosEquipoB1 = puntosEquipoB1 - 1;
                displayPuntosBPrimerCuarto(puntosEquipoB1);
                displayPuntosB(puntosEquipoB1);
            } else if (cuarto == 2 && puntosEquipoB2 > 0) {
                puntosEquipoB2 = puntosEquipoB2 - 1;
                displayPuntosBSegundoCuarto(puntosEquipoB2);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
            } else if (cuarto == 3 && puntosEquipoB3 > 0) {
                puntosEquipoB3 = puntosEquipoB3 - 1;
                displayPuntosBTercerCuarto(puntosEquipoB3);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
            } else if (cuarto == 4 && puntosEquipoB4 > 0) {
                puntosEquipoB4 = puntosEquipoB4 - 1;
                displayPuntosBCuartoCuarto(puntosEquipoB4);
                displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
            }
        }
    }

    //Añadir un punto al jugador visitante 15

    public void puntosB15Mas(View view) {

        puntosB15 = puntosB15 + 1;
        displayPuntosB15(puntosB15);
        if (cuarto == 1) {
            puntosEquipoB1 = puntosEquipoB1 + 1;
            displayPuntosBPrimerCuarto(puntosEquipoB1);
            displayPuntosB(puntosEquipoB1);
        } else if (cuarto == 2) {
            puntosEquipoB2 = puntosEquipoB2 + 1;
            displayPuntosBSegundoCuarto(puntosEquipoB2);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2);
        } else if (cuarto == 3) {
            puntosEquipoB3 = puntosEquipoB3 + 1;
            displayPuntosBTercerCuarto(puntosEquipoB3);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3);
        } else if (cuarto == 4) {
            puntosEquipoB4 = puntosEquipoB4 + 1;
            displayPuntosBCuartoCuarto(puntosEquipoB4);
            displayPuntosB(puntosEquipoB1 + puntosEquipoB2 + puntosEquipoB3 + puntosEquipoB4);
        }
    }

    /**
     * Muestra las faltas del jugador 15 del equipo visitante
     */
    public void displayFaltasB15(int score) {
        TextView scoreView = (TextView) findViewById(R.id.faltasB15);
        if (faltasB15 == 5) {
            scoreView.setTextColor(Color.RED);
            scoreView.setText(String.valueOf(score) + "F");
        } else {
            scoreView.setTextColor(Color.WHITE);
            scoreView.setText(String.valueOf(score) + "F");
        }
    }

    /**
     * Muestra los puntos del jugador 15 del equipo visitante
     */
    public void displayPuntosB15(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosB15);
        scoreView.setText(String.valueOf(score) + "P");
    }

    /**
     * Muestra el cuarto o periodo actual
     */

    public void displayCuarto(int score) {
        Button scoreView = (Button) findViewById(R.id.cuarto);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Muestra las faltas del equipo local
     */
    public void displayFaltasA(int score) {
        TextView scoreView = (TextView) findViewById(faltasA);
        if (cuarto == 1) {
            if (faltasEquipoA1 == 5) {
                scoreView.setTextColor(Color.RED);
                scoreView.setText(String.valueOf(score) + "F");
            } else {
                scoreView.setTextColor(Color.WHITE);
                scoreView.setText(String.valueOf(score) + "F");

            }
        } else if (cuarto == 2) {
            if (faltasEquipoA2 == 5) {
                scoreView.setTextColor(Color.RED);
                scoreView.setText(String.valueOf(score) + "F");
            } else {
                scoreView.setTextColor(Color.WHITE);
                scoreView.setText(String.valueOf(score) + "F");

            }
        } else if (cuarto == 3) {
            if (faltasEquipoA3 == 5) {
                scoreView.setTextColor(Color.RED);
                scoreView.setText(String.valueOf(score) + "F");
            } else {
                scoreView.setTextColor(Color.WHITE);
                scoreView.setText(String.valueOf(score) + "F");

            }

        } else if (cuarto == 4) {
            if (faltasEquipoA4 == 5) {
                scoreView.setTextColor(Color.RED);
                scoreView.setText(String.valueOf(score) + "F");
            } else {
                scoreView.setTextColor(Color.WHITE);
                scoreView.setText(String.valueOf(score) + "F");

            }
        }
    }


    /**
     * Muestra las faltas del equipo visitante
     */

    public void displayFaltasB(int score) {
        TextView scoreView = (TextView) findViewById(faltasB);
        if (cuarto == 1) {
            if (faltasEquipoB1 == 5) {
                scoreView.setTextColor(Color.RED);
                scoreView.setText(String.valueOf(score) + "F");
            } else {
                scoreView.setTextColor(Color.WHITE);
                scoreView.setText(String.valueOf(score) + "F");

            }
        } else if (cuarto == 2) {
            if (faltasEquipoB2 == 5) {
                scoreView.setTextColor(Color.RED);
                scoreView.setText(String.valueOf(score) + "F");
            } else {
                scoreView.setTextColor(Color.WHITE);
                scoreView.setText(String.valueOf(score) + "F");

            }
        } else if (cuarto == 3) {
            if (faltasEquipoB3 == 5) {
                scoreView.setTextColor(Color.RED);
                scoreView.setText(String.valueOf(score) + "F");
            } else {
                scoreView.setTextColor(Color.WHITE);
                scoreView.setText(String.valueOf(score) + "F");

            }

        } else if (cuarto == 4) {
            if (faltasEquipoB4 == 5) {
                scoreView.setTextColor(Color.RED);
                scoreView.setText(String.valueOf(score) + "F");
            } else {
                scoreView.setTextColor(Color.WHITE);
                scoreView.setText(String.valueOf(score) + "F");

            }
        }
    }

    /**
     * Puntos totales y arrastrados por el equipo local
     * /**
     * Muestra puntos del equipo local
     */
    public void displayPuntosA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Muestra puntos del equipo local en el primer cuarto
     */
    public void displayPuntosAPrimerCuarto(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosAPrimerCuarto);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Muestra puntos del equipo local en el segundo cuarto
     */
    public void displayPuntosASegundoCuarto(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosASegundoCuarto);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Muestra puntos del equipo local en el tercer cuarto
     */

    public void displayPuntosATercerCuarto(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosATercerCuarto);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Muestra puntos del equipo local en el cuarto cuarto
     */

    public void displayPuntosACuartoCuarto(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosACuartoCuarto);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Puntos totales y arrastrados del equipo visitante
     * /**
     * Muestra puntos del equipo visitante
     */

    public void displayPuntosB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosB);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Muestra puntos del equipo local en el primer cuarto
     */
    public void displayPuntosBPrimerCuarto(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosBPrimerCuarto);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Muestra puntos del equipo local en el segundo cuarto
     */
    public void displayPuntosBSegundoCuarto(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosBSegundoCuarto);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Muestra puntos del equipo local en el tercer cuarto
     */

    public void displayPuntosBTercerCuarto(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosBTercerCuarto);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Muestra puntos del equipo local en el cuarto cuarto
     */

    public void displayPuntosBCuartoCuarto(int score) {
        TextView scoreView = (TextView) findViewById(R.id.puntosBCuartoCuarto);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Muestra puntos del equipo local en el cuarto cuarto
     */


}