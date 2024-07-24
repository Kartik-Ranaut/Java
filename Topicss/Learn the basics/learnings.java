//  data types
    static int dataTypeSize(String str) {
        switch(str){
            case "Character":
                return Character.BYTES;
            case "Integer":
                return Integer.BYTES;
            case "Long":
                return Long.BYTES;
            case "Float":
                return Float.BYTES;
            case "Double":
                return Double.BYTES;
            default:
                return -1;
        }
    }


