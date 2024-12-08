//package contest;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
//class Film {
//
//    private String id;
//    private String name;
//    private String dateStart;
//    private Category category;
//    private int unit;
//
//    public Film(int id, String name, String dateStartString, Category category, int unit) throws ParseException {
//        this.id = String.format("P%03d", id);  
//        this.name = name;
//        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//        this.dateStart = dateFormat.format(dateFormat.parse(dateStartString));
//        this.category = category;
//        this.unit = unit;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getDateStart() {
//        return dateStart;
//    }
//
//    public int getUnit() {
//        return unit;
//    }
//
//    public Category getCategory() {
//        return category;
//    }
//
//    @Override
//    public String toString() {
//        return String.format("%s %s %s %s %d", id, category.getName(), dateStart, name, unit);
//    }
//
//}
//
//class Category {
//
//    private String id;
//    private String name;
//
//    public Category(int id, String name) {
//        this.id = String.format("TL%03d", id);  
//        this.name = name;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
//
//public class bai12 {
//
//    public static void main(String[] args) throws ParseException {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();  
//        int m = sc.nextInt();  
//        sc.nextLine();  
//
//        
//        HashMap<String, Category> categoryMap = new HashMap<>();
//        for (int i = 1; i <= n; i++) {
//            String categoryName = sc.nextLine().trim();
//            Category category = new Category(i, categoryName);
//            categoryMap.put(category.getId(), category);
//        }
//
//        
//        List<Film> films = new ArrayList<>();
//        for (int i = 1; i <= m; i++) {
//            String categoryId = sc.nextLine().trim();
//            String date = sc.nextLine().trim();
//            String movieName = sc.nextLine().trim();
//            int unit = sc.nextInt();
//            sc.nextLine();  
//
//            Category category = categoryMap.get(categoryId);
//            if (category != null) {
//                Film film = new Film(i, movieName, date, category, unit);
//                films.add(film);
//            }
//        }
//
//
//        films.sort((f1, f2) -> {
//
//            int dateComparison = f1.getDateStart().compareTo(f2.getDateStart());
//            if (dateComparison != 0) {
//                return dateComparison;
//            }
//            int nameComparison = f1.getName().compareTo(f2.getName());
//            if (nameComparison != 0) {
//                return nameComparison;
//            }
//
//            return Integer.compare(f2.getUnit(), f1.getUnit());
//        });
//
//
//        for (Film film : films) {
//            System.out.println(film);
//        }
//    }
//}
//2 3
//Hai huoc
//Tinh cam
//TL001
//25/11/2021
//Phim so 1
//10
//TL001
//04/12/2021
//Phim so 2
//15
//TL002
//25/11/2021
//Phim so 3
//5