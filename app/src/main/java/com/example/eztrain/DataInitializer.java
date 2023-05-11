package com.example.eztrain;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.eztrain.db.DBHelper;
import com.example.eztrain.models.EjercicioAvanzado;
import com.example.eztrain.models.EjercicioConvencional;
import com.example.eztrain.models.EjercicioProgresion;
import com.example.eztrain.models.Progresion;


public class DataInitializer {

    private final DBHelper dbHelper;


    public DataInitializer(Context context) {
        dbHelper = new DBHelper(context);
    }

    public void initializeData() {
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        // Comprueba si la tabla EjerciciosConvencionales está vacía
        Cursor cursor = db.rawQuery("SELECT COUNT(*) FROM " + DBHelper.TABLE_EJERCICIOS_CONVENCIONALES, null);
        cursor.moveToFirst();
        int count = cursor.getInt(0);
        cursor.close();

        if (count == 0) {
            // Añadir los ejercicios si no existen registros en la BD. (Lo creará en un móvil recien instalado)

            addEjercicioConvencional(new EjercicioConvencional("Push up",
                    "Para comenzar con las flexiones debemos colocarnos en el suelo, en decúbito ventral o boca hacia abajo." +
                            " Apoyamos las manos en el suelo, justo por debajo de los hombros y separadas de este ancho." +
                            " Con los pies levemente separados o juntos, despegamos el torso del suelo impulsándonos con los brazos y el pecho.",
                    R.drawable.ic_launcher_foreground,
                    "https://www.youtube.com/watch?v=0pkjOk0EiAk" ));
            addEjercicioConvencional(new EjercicioConvencional("Squat",
                    "La sentadilla o squat es un movimiento que se inicia de pie, mirando al frente y con la espalda recta, mientras los pies se separan del ancho de los hombros," +
                            " siempre mirando al frente y sin curvar la espalda, debemos descender los glúteos flexionando la rodilla y la cadera,  y cuidando que la rodilla no pase de la punta del pie ni sobrepase los 90 grados de flexión. Descendemos hasta que los muslos quedan paralelos al suelo y desde allí debemos elevarnos lentamente.",
                    R.drawable.ic_launcher_foreground,
                    "https://www.youtube.com/watch?v=rMvwVtlqjTE"));

            addEjercicioConvencional(new EjercicioConvencional("Rows", "Coloca tu cuerpo en bloque, paralelo al suelo. Mantén una postura firme en todo momento.\n" +
                    "Lleva tus codos hacia dentro, favoreciendo la rotación externa de tus hombros." +
                    "Estira completamente tus brazos para trabajar con todo el recorrido posible." +
                    "Trata de tocar la barra o anillas con el pecho al subir en cada repetición." +
                    "Mantén tu cabeza alineada con el resto de tu columna para evitar forzar la zona cervical.",
                    R.drawable.ic_launcher_foreground,
                    "https://www.youtube.com/watch?v=bHO0A4ZF_Zg"));


            addEjercicioConvencional(new EjercicioConvencional("Straight Bar Dip", "El ejercicio de Straight Bar Dip es uno de los más difíciles, pero también de los más efectivos para la parte superior del cuerpo. En este ejercicio es necesario que mantengas el peso del cuerpo sobre la barra durante todo el tiempo utilizando solo la parte superior del cuerpo para levantar y bajar el pecho de la barra.",
                    R.drawable.ic_launcher_foreground,
                    "https://www.youtube.com/watch?v=bHO0A4ZF_Zg"));

            addEjercicioConvencional(new EjercicioConvencional("Pull up", "Colócate debajo de la barra de dominadas. Salta y agárrala por encima colocando las manos un poco más abiertas que la anchura de los hombros. Para empezar, cuélgate con brazos y piernas extendidas. Coloca los omóplatos hacia abajo y hacia atrás al tiempo que activas la espalda, el torso y los glúteos. Elévate hasta llevar la barbilla por encima de la barra. Durante el movimiento, piensa en llevar la barra hacia el pecho. Mantén los codos cerca del torso y no arquees las lumbares más de lo natural.",
                    R.drawable.ic_launcher_foreground,
                    "https://www.youtube.com/watch?v=bHO0A4ZF_Zg"));
            addEjercicioConvencional(new EjercicioConvencional("Dip", "Para comenzar con la realización del movimiento se requiere de una máquina de paralelas en la cual debemos apoyar las manos en sus apoya brazos y elevar el cuerpo de manera de despegar los pies del suelo. Con las piernas en el aire, el tronco ligeramente inclinado hacia adelante y los brazos soportando el peso del cuerpo, iniciamos el ejercicio.\n" +
                    "Inspiramos y flexionamos los codos de manera de que el pecho descienda hasta el nivel de las barras, siempre conservando las piernas y el torso inmóvil. Sólo debe moverse el cuerpo hacia abajo y arriba por la flexión de brazos.",
                    R.drawable.ic_launcher_foreground,
                    "https://www.youtube.com/watch?v=bHO0A4ZF_Zg"));
            addEjercicioConvencional(new EjercicioConvencional("Negative Muscle Up", "Este ejercicio se empieza en la posición del Muscle Up y seguimos el recorrido inverso para trabajar la musculatura implicada en la realización de el Muscle Up",
                    R.drawable.ic_launcher_foreground,
                    "https://www.youtube.com/watch?v=bHO0A4ZF_Zg"));
            addEjercicioConvencional(new EjercicioConvencional("Pseudo Push Up", "Para realizar este ejercicio tienes que ponerte en una posición parecida a las flexiones o push ups, en esta posición llevamos nuestras manos a la altura de las caderas y se realiza" +
                    "el el recorrido de la flexión con las escápulas contraidas y el core activado.",
                    R.drawable.ic_launcher_foreground,
                    "https://www.youtube.com/watch?v=bHO0A4ZF_Zg"));
            addEjercicioConvencional(new EjercicioConvencional("Pseudo Planche", "Debes ponerte en posición de plancha, en esta posición contrae las escápulas y lleva tus manos a el nivel de la cintura con los brazos extendidos con el core activado" +
                    ", quédate en esta posición lo que puedas aguantar",
                    R.drawable.ic_launcher_foreground,
                    "https://www.youtube.com/watch?v=bHO0A4ZF_Zg"));
            addEjercicioConvencional(new EjercicioConvencional("Superman", "Empieza en el suelo tumbado sobre tu abdomen con las extremidades estiradas para quedar lo más recto posible, en esta posición levante tus brazos y piernas, separándolas del suelo para realizar el ejercicio.",
                    R.drawable.ic_launcher_foreground,
                    "https://www.youtube.com/watch?v=bHO0A4ZF_Zg"));
            addEjercicioConvencional(new EjercicioConvencional("Leg Raise", "Siéntate en el suelo con el core activado y las palmas de las manos en el suelo, en esta posición sin dejar de apretar el core levanta únicamente las piernas hasta donde puedas y bájalas lentamente.",
                    R.drawable.ic_launcher_foreground,
                    "https://www.youtube.com/watch?v=bHO0A4ZF_Zg"));
            addEjercicioConvencional(new EjercicioConvencional("Tuck Planche", "Empieza con posición de plancha y acomodate poco a poco de forma en la que te sostengas solo con tus brazos con las piernas contraidas hacía tu pecho.",
                    R.drawable.ic_launcher_foreground,
                    "https://www.youtube.com/watch?v=bHO0A4ZF_Zg"));
            addEjercicioConvencional(new EjercicioConvencional("Frog Stand", "Empieza en posición de plancha y acomódate de forma que te sostengas únicamente con tus brazos en paralelo al suelo, las piernas tienen que quedar contraidas con las rodillas en el exterior de tus codos.",
                    R.drawable.ic_launcher_foreground,
                    "https://www.youtube.com/watch?v=bHO0A4ZF_Zg"));
            addEjercicioConvencional(new EjercicioConvencional("Straddle Planche", "Con ayuda de unas paralelas ponte en posición de plancha y eleva tus piernas en forma de 'V' mantén el core activado y no arquees la espalda.",
                    R.drawable.ic_launcher_foreground,
                    "https://www.youtube.com/watch?v=bHO0A4ZF_Zg"));
        }

        //EJERCICIOS AVANZADOS

        // Comprueba si la tabla EjerciciosAvanzados está vacía
        Cursor cursor2 = db.rawQuery("SELECT COUNT(*) FROM " + DBHelper.TABLE_EJERCICIOS_AVANZADOS, null);
        cursor2.moveToFirst();
        int count2 = cursor2.getInt(0);
        cursor2.close();

        if (count2 == 0) {
            // añadir los ejercicios si no existen registros en la BD.
            addEjercicioAvanzado(new EjercicioAvanzado("Muscle Up",
                    "Prueba 1",
                    R.drawable.ic_muestra_com,
                    10,
                    "https://www.youtube.com/watch?v=0pkjOk0EiAk" ));
            addEjercicioAvanzado(new EjercicioAvanzado("One-arm Push up",
                    "Prueba 2",
                    R.drawable.ic_muestra_com,
                    20,
                    "https://www.youtube.com/watch?v=0pkjOk0EiAk" ));
            addEjercicioAvanzado(new EjercicioAvanzado("Full Planche",
                    "Prueba 1",
                    R.drawable.ic_muestra_com,
                    30,
                    "https://www.youtube.com/watch?v=0pkjOk0EiAk" ));
        }

        //PROGRESION
        Cursor cursor3 = db.rawQuery("SELECT COUNT(*) FROM " + DBHelper.TABLE_PROGRESIONES, null);
        cursor3.moveToFirst();
        int count3 = cursor3.getInt(0);
        cursor3.close();
        //PROGRESION
        if (count3 == 0) {
            // añadir las progresiones si no existen registros en la BD.
            //Progresiones Muscle Up
            addProgresion(new Progresion("MuscleUp1", false, "Muscle Up"));
            addProgresion(new Progresion("MuscleUp2", false, "Muscle Up"));
            addProgresion(new Progresion("MuscleUp3", false, "Muscle Up"));
            addProgresion(new Progresion("MuscleUp4", false, "Muscle Up"));

            //Progresiones One-Arm Push Up
            addProgresion(new Progresion("Principiante", false, "One-arm Push up"));
            addProgresion(new Progresion("Intermedio", false, "One-arm Push up"));
            addProgresion(new Progresion("Avanzado", false, "One-arm Push up"));
            addProgresion(new Progresion("Prueba final", false, "One-arm Push up"));

            //Progresiones Full Planche
            //Progresiones One-Arm Push Up
            addProgresion(new Progresion("Principiante", false, "Full Planche"));
            addProgresion(new Progresion("Intermedio", false, "Full Planche"));
            addProgresion(new Progresion("Avanzado", false, "Full Planche"));
            addProgresion(new Progresion("Prueba final", false, "Full Planche"));
        }

        //EJERCICIOS PROGRESION
        Cursor cursor4 = db.rawQuery("SELECT COUNT(*) FROM " + DBHelper.TABLE_EJERCICIOS_PROGRESIONES, null);
        cursor4.moveToFirst();
        int count4 = cursor4.getInt(0);
        cursor4.close();

        if (count4 == 0) {
            // Añadir ejercicios a las progresiones si no existen registros en la BD
            //MUSCLE UP 1
            addEjercicioProgresion(new EjercicioProgresion("MuscleUp1", "Push up", 15, 0, 1, 1));
            addEjercicioProgresion(new EjercicioProgresion("MuscleUp1", "Squat", 10, 0, 2, 1));
            addEjercicioProgresion(new EjercicioProgresion("MuscleUp1", "Rows", 5, 0, 3, 1));
        }
    }

    private void addEjercicioConvencional(EjercicioConvencional ejercicioConvencional) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(DBHelper.COLUMN_NOMBRE_EJERCICIO_CONVENCIONAL, ejercicioConvencional.getNombre());
        values.put(DBHelper.COLUMN_DESCRIPCION_EJERCICIO_CONVENCIONAL, ejercicioConvencional.getDescripcion());
        values.put(DBHelper.COLUMN_IMG_EJERCICIO_COVENCIONAL, ejercicioConvencional.getImagen());
        values.put(DBHelper.COLUMN_URL_VIDEO_CONVENCIONAL, ejercicioConvencional.getUrl());
        db.insert(DBHelper.TABLE_EJERCICIOS_CONVENCIONALES, null, values);
        db.close();
    }

    private void addEjercicioAvanzado(EjercicioAvanzado ejercicioAvanzado) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(DBHelper.COLUMN_NOMBRE_EJERCICIO_AVANZADO, ejercicioAvanzado.getNombre());
        values.put(DBHelper.COLUMN_DESCRIPCION_EJERCICIO_AVANZADO, ejercicioAvanzado.getDescripcion());
        values.put(DBHelper.COLUMN_IMG_EJERCICIO_AVANZADO, ejercicioAvanzado.getImagen());
        values.put(DBHelper.COLUMN_PROGRESO_AVANZADO, ejercicioAvanzado.getProgreso());
        values.put(DBHelper.COLUMN_URL_VIDEO_AVANZADO, ejercicioAvanzado.getUrl());
        db.insert(DBHelper.TABLE_EJERCICIOS_AVANZADOS, null, values);
        db.close();
    }

    private void addProgresion(Progresion progresion) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(DBHelper.COLUMN_NOMBRE_PROGRESION, progresion.getNombre());
        values.put(DBHelper.COLUMN_COMPLETADO, progresion.isCompletado());
        values.put(DBHelper.COLUMN_EJERCICIO_AVANZADO, progresion.getEjercicioAvanzado());
        db.insert(DBHelper.TABLE_PROGRESIONES, null, values);
        db.close();
    }

    private void addEjercicioProgresion(EjercicioProgresion ejercicioProgresion) {
        SQLiteDatabase db = dbHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(DBHelper.COLUMN_ID_PROGRESION, ejercicioProgresion.getIdProgresion());
        values.put(DBHelper.COLUMN_ID_EJERCICIO_CONVENCIONAL, ejercicioProgresion.getIdEjercicioConvencional());
        values.put(DBHelper.COLUMN_NUMERO_EJERCICIO, ejercicioProgresion.getNumeroEjercicio());
        values.put(DBHelper.COLUMN_SEGUNDOS_EJERCICIO, ejercicioProgresion.getSegundos());
        values.put(DBHelper.COLUMN_REPETICIONES_EJERCICIO, ejercicioProgresion.getRepeticiones());
        values.put(DBHelper.COLUMN_TIPO_EJERCICIO_COVENCIONAL, ejercicioProgresion.getTipo());
        db.insert(DBHelper.TABLE_EJERCICIOS_PROGRESIONES, null, values);
        db.close();
    }


}





