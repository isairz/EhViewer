/*
 * Copyright 2016 Hippo Seven
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

package com.hippo.ehviewer.client.parser;

import android.support.annotation.Nullable;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Like http://wasabisyrup.com/archives/IE3Q3_TFzaE
 *
 */
public final class GalleryArchiveUrlParser {

    public static final Pattern URL_PATTERN = Pattern.compile("/archives/(.+)");

    @Nullable
    public static String parse(String url) {
        if (url == null) {
            return null;
        }

        Matcher m = URL_PATTERN.matcher(url);
        if (m.find()) {
            return m.group(1);
        } else {
            return null;
        }
    }
}
