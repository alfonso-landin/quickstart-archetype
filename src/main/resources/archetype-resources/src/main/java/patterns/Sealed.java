package ${package}.patterns;

public sealed interface Sealed {
    record Uno(int i) implements Sealed {}
    record Dos(double d) implements Sealed {}

    static int which(Sealed s) {
      return switch(s) {
      case Uno _ -> 1;
      case Dos _ -> 2;
      };
    }

    default int w() {
      return switch(this) {
      case Uno _ -> 1;
      case Dos _ -> 2;
      };
    }
}
