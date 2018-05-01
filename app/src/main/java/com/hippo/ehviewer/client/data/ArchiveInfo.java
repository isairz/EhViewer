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

package com.hippo.ehviewer.client.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.Nullable;

import java.util.regex.Pattern;

public class ArchiveInfo implements Parcelable {

    public String uid;
    public String title;
    public boolean visited;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.uid);
        dest.writeString(this.title);
        dest.writeByte(visited ? (byte) 1 : (byte) 0);;
    }

    public ArchiveInfo() {}

    protected ArchiveInfo(Parcel in) {
        this.uid = in.readString();
        this.title = in.readString();
        this.visited = in.readByte() != 0;
    }

    public static final Creator<ArchiveInfo> CREATOR = new Creator<ArchiveInfo>() {

        @Override
        public ArchiveInfo createFromParcel(Parcel source) {
            return new ArchiveInfo(source);
        }

        @Override
        public ArchiveInfo[] newArray(int size) {
            return new ArchiveInfo[size];
        }
    };
}
