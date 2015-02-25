package com.juanpabloprado.dw.examples.views;

import io.dropwizard.views.View;

/**
 * Created by Juan on 25/02/2015.
 */
public class FileView extends View {

    public FileView() {
        super("/views/file.mustache");
    }
}
