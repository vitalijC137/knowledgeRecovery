package com.collection;

public class CollectionExploration {

    public void executive() {
        mapExecutive();
        listExecutive();
        setExecutive();
        queueExecutive();
    }

    public void mapExecutive() {
        MapExploration mapExploration = new MapExploration();
        mapExploration.hashMapMaster();
    }

    public void listExecutive() {
        ListExploration listExploration = new ListExploration();
        listExploration.withoutArrayListOperationExample();
        listExploration.withArrayLIstOperationExample();
    }

    public void setExecutive() {
        SetExploration setExploration = new SetExploration();
        setExploration.hashSetMaster();
    }

    public void queueExecutive() {
        QueueExploration queueExploration = new QueueExploration();
        queueExploration.priorityQueueMaster();
    }

}
