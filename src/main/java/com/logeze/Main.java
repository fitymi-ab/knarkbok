package com.logeze;

import io.javalin.Javalin;

public class Main {
    static void main() {
        int port = 7070;

        Javalin.create(javalinConfig -> javalinConfig.staticFiles.add("/site"))
                .start(port);
    }
}
