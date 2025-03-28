package com.devmaster.lesson02.tight_loosely_coupling;

import java.util.Arrays;
import java.util.stream.Stream;

// Loosely coupling
interface SortAlgorithm {
    void sort(int[] array);
}

class LooselyBubbleSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        System.out.println("Sorted using bubble sort algorithm");
        Arrays.stream(array).sorted().forEach(System.out::println);
    }
}

public class LooselyCouplingService {
    private SortAlgorithm sortAlgorithm;

    public LooselyCouplingService() {}

    public LooselyCouplingService(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public void complexBusiness(int[] array) {
        sortAlgorithm.sort(array);
    }

    public static void main(String[] args) {
        LooselyCouplingService sortAlgorithm =
                new LooselyCouplingService(new LooselyBubbleSortAlgorithm());
        sortAlgorithm.complexBusiness(new int[]{11, 21, 13, 42, 15});
    }
}
