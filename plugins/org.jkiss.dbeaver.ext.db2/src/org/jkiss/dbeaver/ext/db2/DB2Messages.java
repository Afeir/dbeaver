/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2020 DBeaver Corp and others
 * Copyright (C) 2011-2012 Eugene Fradkin (eugene.fradkin@gmail.com)
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

package org.jkiss.dbeaver.ext.db2;

import org.eclipse.osgi.util.NLS;

public class DB2Messages extends NLS {
    static final String BUNDLE_NAME = "org.jkiss.dbeaver.ext.db2.DB2Resources"; //$NON-NLS-1$

    static {
        // initialize resource bundle
        NLS.initializeMessages(BUNDLE_NAME, DB2Messages.class);
    }

    private DB2Messages()
    {
        // Pure Utility Class
    }

    public static String dialog_explain_choose_tablespace;
    public static String dialog_explain_choose_tablespace_tablespace;
    public static String dialog_explain_no_tables;
    public static String dialog_explain_no_tablespace_found_title;
    public static String dialog_explain_no_tables_found_ex;
    public static String dialog_explain_ask_to_create;

    public static String editors_db2_application_editor_title_force_application;
    public static String editors_db2_application_editor_action_force;
    public static String editors_db2_application_editor_confirm_action;

    public static String no_ddl_for_system_tables;
    public static String no_ddl_for_nicknames;
    public static String no_ddl_for_nonsql_routines;
    public static String no_ddl_for_spaces_in_name;

}
