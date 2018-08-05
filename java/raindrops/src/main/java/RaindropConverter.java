class RaindropConverter {

    String convert(int number) {

        StringBuilder converted = new StringBuilder();

        if (number % 3 == 0) {
            converted.append("Pling");
        }
        if (number % 5 == 0) {
            converted.append("Plang");
        }
        if (number % 7 == 0) {
            converted.append("Plong");
        }
        if (converted.toString().equals("")){
            converted.append(number);
        }

        return converted.toString();
    }

}
