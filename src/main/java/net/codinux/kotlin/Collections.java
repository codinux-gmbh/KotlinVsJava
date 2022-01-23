package net.codinux.kotlin;

import java.util.List;
import java.util.stream.Collectors;

public class Collections {

    public long count(List<Long> clientIds) {
        return clientIds.stream().filter(id -> id > 10).count();
    }

    public List<String> map(List<Long> clientIds) {
        return clientIds.stream().map(id -> id.toString()).collect(Collectors.toList());
    }

    public List<String> mapNotNull(List<Long> clientIds) {
        return clientIds.stream().filter(id -> id != null).map(id -> id.toString()).collect(Collectors.toList());
    }

    public void joinToString(List<Long> clientIds) {
        System.out.println(clientIds.stream().map(id -> id.toString()).collect(Collectors.joining(", ")));
    }

    public void joinToStringWithOptions(List<Long> clientIds) {
        System.out.println(clientIds.stream().map(id -> "ID: " + id).collect(Collectors.joining("; ", "clientIds: ", ".")));
    }

    public List<Long> instanceOf(List<Number> clientIds) {
        return clientIds.stream().filter(id -> id instanceof Long).map(id -> (Long) id).collect(Collectors.toList());
    }

}