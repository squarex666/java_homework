package Java_3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

/**
 * Java_3
 * Задания по вариантам. Вариант 9
 */

class MilitaryComposition {
    private String lastName;          // Фамилия
    private String unit;              // Рота
    private String rank;              // Звание
    private Date birthDate;           // Дата рождения
    private Date enlistmentDate;      // Дата поступления на службу
    private String militaryPart;      // Часть

    public MilitaryComposition(String lastName, String unit, String rank, Date birthDate, Date enlistmentDate, String militaryPart) {
        this.lastName = lastName;
        this.unit = unit;
        this.rank = rank;
        this.birthDate = birthDate;
        this.enlistmentDate = enlistmentDate;
        this.militaryPart = militaryPart;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getEnlistmentDate() {
        return enlistmentDate;
    }

    public void setEnlistmentDate(Date enlistmentDate) {
        this.enlistmentDate = enlistmentDate;
    }

    public String getMilitaryPart() {
        return militaryPart;
    }

    public void setMilitaryPart(String militaryPart) {
        this.militaryPart = militaryPart;
    }

    @Override
    public String toString() {
        return String.format("Last Name: %s, Unit: %s, Rank: %s, Birth Date: %s, Enlistment Date: %s, Military Part: %s",
                lastName, unit, rank, birthDate.toString(), enlistmentDate.toString(), militaryPart);
    }
}

class GroupMilitaryComposition {
    private int groupId;
    private MilitaryComposition[] soldiers;

    public GroupMilitaryComposition() {
        this.groupId = 0;
        this.soldiers = new MilitaryComposition[0];
    }

    public GroupMilitaryComposition(int groupId, MilitaryComposition[] soldiers) {
        this.groupId = groupId;
        this.soldiers = soldiers;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public MilitaryComposition[] getSoldiers() {
        return soldiers;
    }

    public void setSoldiers(MilitaryComposition[] soldiers) {
        this.soldiers = soldiers;
    }

    public void addSoldier(MilitaryComposition soldier) {
        soldiers = Arrays.copyOf(soldiers, soldiers.length + 1);
        soldiers[soldiers.length - 1] = soldier;
    }

    public boolean removeSoldierByLastName(String lastName) {
        for (int i = 0; i < soldiers.length; i++) {
            if (soldiers[i].getLastName().equals(lastName)) {
                MilitaryComposition[] newSoldiers = new MilitaryComposition[soldiers.length - 1];
                for (int j = 0, k = 0; j < soldiers.length; j++) {
                    if (!soldiers[j].getLastName().equals(lastName)) {
                        newSoldiers[k++] = soldiers[j];
                    }
                }
                soldiers = newSoldiers;
                return true;
            }
        }
        return false;
    }

    public void sortByLastName() {
        Arrays.sort(soldiers, Comparator.comparing(MilitaryComposition::getLastName));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group ID: ").append(groupId).append("\n");
        sb.append("Soldiers in this group: \n");
        for (MilitaryComposition soldier : soldiers) {
            sb.append(soldier).append("\n");
        }
        return sb.toString();
    }
}


public class Millitary_сompany {
    public static void main(String[] args) {
        MilitaryComposition soldier1 = new MilitaryComposition("Ivanov", "1st Battalion", "Sergeant",
                new Date(95, 10, 1), new Date(115, 8, 15), "Part A");
        MilitaryComposition soldier2 = new MilitaryComposition("Petrov", "2nd Battalion", "Lieutenant",
                new Date(90, 4, 10), new Date(118, 6, 20), "Part B");
        MilitaryComposition soldier3 = new MilitaryComposition("Sidorov", "3rd Battalion", "Captain",
                new Date(92, 8, 25), new Date(116, 5, 10), "Part C");

        MilitaryComposition[] soldiers = {soldier1, soldier2, soldier3};

        GroupMilitaryComposition group = new GroupMilitaryComposition(101, soldiers);

        System.out.println(group);

        MilitaryComposition soldier4 = new MilitaryComposition("Kuznetsov", "4th Battalion", "Major",
                new Date(85, 2, 5), new Date(120, 3, 30), "Part D");
        group.addSoldier(soldier4);
        System.out.println("After adding a soldier:");
        System.out.println(group);

        group.removeSoldierByLastName("Petrov");
        System.out.println("After removing a soldier:");
        System.out.println(group);

        group.sortByLastName();
        System.out.println("After sorting by last name:");
        System.out.println(group);
    }
}
