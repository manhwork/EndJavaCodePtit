package contest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

class Film {

    String id, name, dateStart, unit;
    TheLoai theloai;

    public Film(int id, String name, String dateStart, String unit, TheLoai theloai) throws ParseException {
        this.id = String.format("P%03d", id);
        this.name = name;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        this.dateStart = sdf.format(sdf.parse(dateStart));
        this.unit = unit;
        this.theloai = theloai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public TheLoai getTheloai() {
        return theloai;
    }

    public void setTheloai(TheLoai theloai) {
        this.theloai = theloai;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s", id, theloai.getName(), dateStart, name, unit);
    }

}

class TheLoai {

    String id, name;

    public TheLoai(int id, String name) {
        this.id = String.format("TL%03d", id);
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class bai12_1 {

    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sc.nextLine();
        HashMap<String, TheLoai> theloaiMap = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            TheLoai theloai = new TheLoai(i, sc.nextLine());
            theloaiMap.put(theloai.getId(), theloai);
        }

        ArrayList<Film> films = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            String theloaiId = sc.nextLine();
            String date = sc.nextLine();
            String name = sc.nextLine();
            String unit = sc.nextLine();
            Film film = new Film(i, name, date, unit, theloaiMap.get(theloaiId));
            films.add(film);
        }
        films.sort((o1, o2) -> {
            try {
                if (!o1.getDateStart().equals(o2.getDateStart())) {
                    return sdf.parse(o1.getDateStart()).compareTo(sdf.parse(o2.getDateStart()));
                }
                if (!o1.getName().equals(o2.getName())) {
                    return o1.getName().compareTo(o2.getName());
                }
                return o1.getUnit().compareTo(o2.getUnit());

            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        }
        );
        System.out.println(films);
    }

}
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
