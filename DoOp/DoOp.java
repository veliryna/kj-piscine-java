public class DoOp {
    public static String operate(String[] args) {
        if(args.length != 3) return "Error";
        else{
            try{
                Integer f = Integer.parseInt(args[0]);
                Integer s  = Integer.parseInt(args[2]);
                switch (args[1]) {
                    case "+" -> {
                        return String.valueOf(f + s);
                    }
                    case "-" -> {
                        return String.valueOf(f - s);
                    }
                    case "*" -> {
                        return String.valueOf(f * s);
                    }
                    case "/" -> {
                        if (s != 0) return String.valueOf(f / s);
                        else return "Error";
                    }
                    case "%" -> {
                        if (s != 0) return String.valueOf(f % s);
                        else return "Error";
                    }
                    default -> {
                        return "Error";
                    }
                }
            } catch (NumberFormatException e){
                return "Error";
            }
        }
    }
}
