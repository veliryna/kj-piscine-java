public class CleanExtract {
    public static String extract(String s) {
        StringBuilder res = new StringBuilder();
        String[] split_ = s.split("\\|");
        for (String sbs : split_) {
            int firstDotIndex = sbs.indexOf('.');
            int lastDotIndex = sbs.lastIndexOf('.');

            if (-1 != firstDotIndex && -1 != lastDotIndex && firstDotIndex < lastDotIndex) {
                String ext = sbs.substring(firstDotIndex + 1, lastDotIndex).trim();
                if (!ext.isEmpty()) res.append(ext).append(" ");
            } else if (-1 != firstDotIndex) {
                String ext = sbs.substring(firstDotIndex + 1).trim();
                if (!ext.isEmpty()) res.append(ext).append(" ");
            } else {
                String ext = sbs.trim();
                if (!ext.isEmpty()) res.append(ext).append(" ");
            }
        }

        return res.toString().trim();
    }
}
