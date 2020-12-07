package com.taa2020;

import java.text.DecimalFormat;

public class BasicCalculator {

    private Integer floatingPoints;

    public BasicCalculator(){
        floatingPoints = 10;
    }

    public BasicCalculator(Integer floatingPoints){
        this.floatingPoints = floatingPoints;
    }

   /* Method takes variable number of parameters
      There cannot be multiple usages of ... in the same method signature
      Also, other parameters can be added only in front of variable number of parameters, it has to be the last one
    */
    public Integer add(Integer... numbers){
        Integer sum = 0;
        for (Integer n: numbers) {
            sum += n;
        }
        return sum;
    }

    public Double add(Double... numbers){
        Double sum = 0.0;
        for (Double n: numbers) {
            sum += n;
        }
        return formatDouble(sum);
    }

    public Long add(Long... numbers){
        Long sum = 0L;
        for (Long n: numbers) {
            sum += n;
        }
        return sum;
    }


    public Integer subtract(Integer... numbers){
        Integer result = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            result -= numbers[i];
        }
        return result;
    }

    public Double subtract(Double... numbers){
        Double result = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            result -= numbers[i];
        }
        return formatDouble(result);
    }

    public Long subtract(Long... numbers){
        Long result = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            result -= numbers[i];
        }
        return result;
    }

    public Long multiply(Integer... numbers){
        Long result = 1L;
        for (Integer n: numbers) {
            result*=n;
        }
        return result;
    }

    public Double multiply(Double... numbers){
        Double result = 1.0;
        for (Double n: numbers) {
            result*=n;
        }
        return formatDouble(result);
    }

    public Long multiply(Long... numbers){
        Long result = 1L;
        for (Long n: numbers) {
            result*=n;
        }
        return result;
    }

    public Double divide(Integer... numbers){
        Double result = numbers[0].doubleValue();
        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] == 0){
                throw new IllegalArgumentException("Number list contains 0. Can't divide by 0.");
            }
            result /= numbers[i];
        }

        return formatDouble(result);
    }

    public Double divide(Double... numbers){
        Double result = numbers[0].doubleValue();
        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] == 0.0){
                throw new IllegalArgumentException("Number list contains 0.0. Can't divide by 0.0.");
            }
            result /= numbers[i];
        }
            return formatDouble(result);
    }

    public Double divide(Long... numbers){
        Double result = numbers[0].doubleValue();
        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] == 0){
                throw new IllegalArgumentException("Number list contains 0. Can't divide by 0.");
            }
            result /= numbers[i];
        }
      //  return formatDouble(result);
        return result;
    }

    protected Double formatDouble(Double number){
        String pattern = "#.";
        for(int i = 1; i <= floatingPoints; i++){
            pattern += "0";
        }

        DecimalFormat numberFormat = new DecimalFormat(pattern);
        String formatResult = numberFormat.format(number);
        return Double.parseDouble(formatResult ); // converting from String to a Double
    }
}
