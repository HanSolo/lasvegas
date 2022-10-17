/*
 * Copyright (c) 2022 by Gerrit Grunwald
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.hansolo.fx.fonts;

import javafx.scene.text.Font;


public class Fonts {
    private static final String NEUTON_700_NAME;

    private static String neuton700Name;


    static {
        try {
            neuton700Name = Font.loadFont(Fonts.class.getResourceAsStream("/eu/hansolo/fx/lasvegas/fonts/neuton-v18-700.ttf"), 10).getName();
        } catch (Exception exception) { }
        NEUTON_700_NAME = neuton700Name;
    }


    // ******************** Methods *******************************************
    public static Font neuton700(final double size) { return new Font(NEUTON_700_NAME, size); }
}
