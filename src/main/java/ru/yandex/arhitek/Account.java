package ru.yandex.arhitek;

public class Account {

  private final String name;

  public Account(String name) {
    this.name = name;
  }

  public boolean checkNameToEmboss() {
    return checkNamelength() && checkNameWhiteSpace() && checkNameSpaceStartEnd();
  }

  public boolean checkNameWhiteSpace() {
    int spaceCount = 0;
    if (name != null) {
      for (int i = 0; i < name.length(); i++) {
        if (name.charAt(i) == ' ') {
          spaceCount++;
        }
      }
      return spaceCount == 1;
    }
    return false;
  }

  public boolean checkNameSpaceStartEnd() {
    return !name.startsWith(" ") && (!name.endsWith(" "));
  }

  public boolean checkNamelength() {
    return (name.length() >= 3) && name.length() < 20;
  }
}
