public class EjercicioT4 {

    public static void main(String[] args) {

        int numeroIf = 10;
        int numeroWhile = -3;
        int numeroDoWhile = 0;

        if (numeroIf > 0)
            System.out.println("Es positivo");
        else if (numeroIf < 0)
            System.out.println("Es negativo");
        else
            System.out.println("Es 0");


        while (numeroWhile < 3){
            System.out.println("NumeroWhile " + numeroWhile);
            numeroWhile++;
        }

        do {
                numeroDoWhile++;
                System.out.println("NumeroDoWhile " + numeroDoWhile);

        }while (1 > 3);

        for (int numeroFor = 0; numeroFor <= 3; numeroFor++)
            System.out.println(numeroFor);

        String estacion = "Otoño";
        switch (estacion){
            case "Primavera":
                System.out.println("Estas en primavera");
                break;
            case "Verano":
                System.out.println("Estas en verano");
                break;
            case "Otoño":
                System.out.println("Estas en otoño");
                break;
            case "Invierno":
                System.out.println("Estas en invierno");
                break;
            default:
                System.out.println("No es una estacion");
        }

    }


}
