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

 package eu.hansolo.fx;

 import javafx.application.Application;
 import javafx.application.Platform;
 import javafx.geometry.Insets;
 import javafx.scene.Scene;
 import javafx.scene.layout.StackPane;
 import javafx.stage.Stage;


 /**
  * User: hansolo
  * Date: 17.10.22
  * Time: 10:34
  */
 public class LasVegas extends Application {

     @Override public void init() {

     }

     private void initOnFxApplicationThread(final Stage stage) {

         registerListeners();
     }

     private void registerListeners() {

     }

     @Override public void start(final Stage stage) {
         StackPane pane = new StackPane();
         pane.setPadding(new Insets(10));

         Scene scene = new Scene(pane);

         stage.setTitle("Title");
         stage.setScene(scene);
         stage.show();
         stage.centerOnScreen();
     }

     @Override public void stop() {
         Platform.exit();
         System.exit(0);
     }

     public static void main(String[] args) {
         launch(args);
     }
 }
