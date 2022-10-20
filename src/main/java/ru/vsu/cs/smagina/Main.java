package ru.vsu.cs.smagina;

public class Main {
    public static void main(String[] args){
        PrefixTree prefixTree = new PrefixTree();
        prefixTree.add("svvs");
        prefixTree.add("svva");
        prefixTree.add("svvb");
        prefixTree.find("svva");
        prefixTree.remove("svvb");
    }
}
