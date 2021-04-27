package week12d02.junior;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Street {

    private final List<Site> soldSites = new ArrayList<>();

    public void sellSite(Site site) {
        soldSites.add(site);
    }

    public int getLastSoldHouseNumber() {
        int sideOfLast = soldSites.get(soldSites.size() - 1).getSide();
        int num = sideOfLast == 1 ? -1 : 0;
        for (Site site : soldSites) {
            if (site.getSide() == sideOfLast) {
                num += 2;
            }
        }
        return num;
    }

    public Map<Fence, Integer> salesByFenceType() {
        Map<Fence, Integer> result = new HashMap<>();
        for (Fence fence : Fence.values()) {
            result.put(fence, 0);
            for (Site site : soldSites) {
                if (site.getFence().equals(fence)) {
                    result.put(fence, result.get(fence) + 1);
                }
            }
        }
        return result;
    }

    public Map<Fence, Integer> salesByFenceType_2() {
        Map<Fence, Integer> result = new HashMap<>();
        for (Site site : soldSites) {
            if (!result.containsKey(site.getFence())) {
                result.put(site.getFence(), 0);
            }
            result.put(site.getFence(), result.get(site.getFence()) + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        Street street = new Street();
        List<Site> sites = List.of(
                new Site(0, 10, Fence.PERFECT),
                new Site(0, 7, Fence.NEED_UPGRADE),
                new Site(1, 12, Fence.NEED_UPGRADE),
                new Site(0, 9, Fence.PERFECT),
                new Site(0, 11, Fence.NO_FENCE),
                new Site(1, 13, Fence.PERFECT)
        );
        System.out.println("Sold houses: ");
        for (Site site : sites) {
            street.sellSite(site);
            System.out.println(site);
        }
        System.out.println("House number of last sold house: " + street.getLastSoldHouseNumber());
        System.out.println("Statistics: " + street.salesByFenceType());
        System.out.println("Statistics: " + street.salesByFenceType_2());
    }
}

