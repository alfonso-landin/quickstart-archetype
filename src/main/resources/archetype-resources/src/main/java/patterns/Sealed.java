package ${package}.patterns;

public sealed interface Sealed {
    record Uno(int i) implements Sealed {}
    record Dos(double d) implements Sealed {}

    static int which(Sealed s) {
      return switch(s) {
      case Uno u -> 1;
      case Dos d -> 2;
      };
    }

    default int w() {
      return switch(this) {
      case Uno u -> 1;
      case Dos d -> 2;
      };
    }
}
