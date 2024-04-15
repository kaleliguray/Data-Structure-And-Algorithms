package src.interval;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Interval {

    private int start;
    private int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public List<Interval> merge(List<Interval> intervals){

        if(intervals.size() < 2){
            return intervals;
        }

        intervals.sort(Comparator.comparingInt(in -> in.start)); // this method sort the intervals based on the start

        List<Interval> result = new LinkedList<>();

        Interval first =  intervals.get(0);
        int start = first.start;
        int end = first.end;

        for (int i = 1; i<intervals.size(); i++){
            Interval current = intervals.get(i);
            if (current.start <= end){
                end = Math.max(current.end, end);

            } else {
                result.add(new Interval(start, end));
                start = current.start;
                end = current.end;
            }
        }

        result.add(new Interval(start, end));
        return result;
    }


    public List<Interval> insert (List<Interval> intervals, Interval newInterval){
        if (intervals == null || intervals.isEmpty()){
            return intervals;
        }
        List<Interval> result = new LinkedList<>();
        int i = 0;

        while (i < intervals.size() && intervals.get(i).end < newInterval.start){
            result.add(intervals.get(i));
            i++;
        }

        while (i < intervals.size() && intervals.get(i).start <= newInterval.end){
            Interval current = intervals.get(i);
            newInterval.start = Math.min(current.start, newInterval.start);
            newInterval.end = Math.max(current.end, newInterval.end);
            i++;
        }

        result.add(newInterval);

        while (i < intervals.size()){
            result.add(intervals.get(i));
            i++;
        }

        return result;
    }

    private static void printIntervals(List<Interval> intervals) {
        for (Interval interval : intervals) {
            System.out.print("(" + interval.start + "," + interval.end + ") ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Test merge method
        System.out.println("Testing merge method:");
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 3));
        intervals.add(new Interval(2, 6));
        intervals.add(new Interval(8, 10));
        intervals.add(new Interval(15, 18));
        Interval interval = new Interval(2, 5);
        Interval interval1 = new Interval(4, 8);
        System.out.println("Original intervals:");
        printIntervals(intervals);
        List<Interval> mergedIntervals = interval.merge(intervals);
        System.out.println("Merged intervals:");
        printIntervals(mergedIntervals);

        // Test insert method
        System.out.println("\nTesting insert method:");
        List<Interval> intervals2 = new ArrayList<>();
        intervals2.add(new Interval(1, 2));
        intervals2.add(new Interval(3, 5));
        intervals2.add(new Interval(6, 7));
        intervals2.add(new Interval(8, 10));
        intervals2.add(new Interval(12, 16));
        Interval newInterval = new Interval(4, 8);
        List<Interval> new_interval = new ArrayList<>();
        new_interval.add(newInterval);
        System.out.println("Original intervals:");
        printIntervals(intervals2);
        System.out.println("New inteval:");
        printIntervals(new_interval);
        List<Interval> insertedIntervals = interval1.insert(intervals2, newInterval);
        System.out.println("Intervals after insertion:");
        printIntervals(insertedIntervals);


    }




}
