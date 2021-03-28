package lotto.util;

public class InputValidator {

  public static boolean isEmptyOrBlank(String input) {
    if (isEmpty(input) || isBlank(input)) {
      return true;
    }
    return false;
  }

  public static boolean isEmpty(String input) {
    return "".equals(input);
  }

  public static boolean isBlank(String input) {
    return input == null;
  }

}
