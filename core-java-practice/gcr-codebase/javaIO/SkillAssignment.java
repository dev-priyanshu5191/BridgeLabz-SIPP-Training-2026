import java.util.*;

public class SkillAssignment {

    static void findTeams(int[] arr,
                          int target,
                          int index,
                          List<Integer> team) {

        if (target == 0) {
            System.out.println(team);
            return;
        }

        if (index == arr.length || target < 0)
            return;

        team.add(arr[index]);

        findTeams(arr,
                target - arr[index],
                index + 1,
                team);

        team.remove(team.size() - 1);

        findTeams(arr,
                target,
                index + 1,
                team);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};
        int target = 10;

        findTeams(skills, target, 0,
                new ArrayList<>());
    }
}