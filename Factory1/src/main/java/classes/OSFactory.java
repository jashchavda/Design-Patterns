package classes;

public class OSFactory {           // so this class return the object of OS
    public OS getInstance(String str) {           // so we directly return the object of OS based on the string we enter

      if(str.equals("Android")) {
          return new Android();
      }
      else if(str.equals("IOS")) {
          return new IOS();

      }
      else if(str.equals("Windows")) {
          return new windows();
      }
    }
}
