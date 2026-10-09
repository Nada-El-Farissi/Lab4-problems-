package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit(double c) {
        return c * 9 / 5 + 32.0;
    }

    //
    // Instance method to get a formatted summary string
    public String getSummary() {
        double tempInFahrenheit = temperatureFahrenheit(temperatureCelsius);
        String output = String.format("Current weather: %.1f °C (%.1f °F) and %s", temperatureCelsius, tempInFahrenheit, conditions);
        return output;
    }

//    // Static factory method to create a WeatherData record from Fahrenheit
  public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
        double tempInCelcius=(tempFahrenheit-32)*5/9; //converting to °F
        WeatherData newRecord=new WeatherData(tempInCelcius, conditions);
        return newRecord;
   }

  public static void main(String[] args) {

      WeatherData today=new WeatherData(25,"Sunny");
      //calling instance methods:
      System.out.println("Today's weather: "+today.getSummary());
      //using the static factory method:
      WeatherData yesterday= fromFahrenheit( 50, "Cloudy" );
      System.out.println("Yesterday's weather: "+yesterday.getSummary());

    }
}
