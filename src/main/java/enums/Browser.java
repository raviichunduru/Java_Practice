package enums;

public enum Browser {
  CHROME {
    @Override
    public String asLowerCase() {
      return CHROME.toString().toLowerCase();
    }
  },
  FIREFOX {
    @Override
    public String asLowerCase() {
      return FIREFOX.toString().toLowerCase();
    }
  },
  IE {
    @Override
    public String asLowerCase() {
      return IE.toString().toLowerCase();
    }
  };

  public abstract String asLowerCase();
}
