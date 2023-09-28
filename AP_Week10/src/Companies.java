import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Check {
public int compare(Company s1, Company s2);
}
class Company {
private String name;
private String city;
private String domain;
private int sharePrice;
Company(String name, String city, String domain, int sharePrice) {
this.name = name;
this.city = city;
this.domain = domain;
this.sharePrice = sharePrice;
}
public String toString() {
return "city: " + city + " domain " + domain + "Name: " + name + " share price" + sharePrice;
}
public String getName() {
return name;
}
public String getCity() {
return city;
}
public int getSharePrice() {
return sharePrice;
}
public String getDomain() {
return domain;
}
}
public class Companies {
List<Company> companies = new ArrayList<Company>();
public void sort(Check c) {
for (int i = 0; i < companies.size() - 1; i++) {
for (int j = i + 1; j < companies.size(); j++) {
if (c.compare(companies.get(i), companies.get(j)) > 0) {
Company temp = companies.get(i);
companies.set(i, companies.get(j));
companies.set(j, temp);
}
}
}
}
public Companies() {
companies.add(new Company("PB Parts", "Melbourne", "Automobile", 390));
companies.add(new Company("GetQuick", "Sydney", "Logistics", 250));
companies.add(new Company("Holden", "Perth", "Automobile", 1220));
companies.add(new Company("BestTours", "Melbourne", "Travel", 420));
companies.add(new Company("Borders", "Melbourne", "Travel", 320));
companies.add(new Company("TJ Parts", "Melbourne", "Automobile", 170));
companies.add(new Company("KParts", "Melbourne", "Automobile", 230));
companies.add(new Company("Toyota", "Perth", "Automobile", 920));
}
public void print() {
companies.forEach(System.out::println);
}
public static void main(String args[]) {
Companies c = new Companies();
// Your code goes here
c.print();
}
}