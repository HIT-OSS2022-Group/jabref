package org.jabref.gui.openoffice;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import org.jabref.logic.citationstyle.CitationStyle;
import org.jabref.logic.openoffice.style.OOBibStyle;

public class StyleSelectCslItemViewModel {

    private final StringProperty title = new SimpleStringProperty("");
    private final StringProperty file = new SimpleStringProperty("");
    private final StringProperty source = new SimpleStringProperty("");

    private final CitationStyle style;

    public StyleSelectCslItemViewModel(CitationStyle style) {
        this.title.setValue(style.getTitle());
        this.file.setValue(style.getFilePath());
        this.source.setValue(style.getSource());
        this.style = style;
    }

    public StringProperty titleProperty() {
        return title;
    }

    public StringProperty fileProperty() {
        return file;
    }

    public StringProperty sourceProperty() {
        return source;
    }

    public CitationStyle getStyle() {
        return style;
    }
}
