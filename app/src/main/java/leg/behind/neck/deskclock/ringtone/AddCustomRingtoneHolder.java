/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package leg.behind.neck.deskclock.ringtone;

import android.net.Uri;

import leg.behind.neck.deskclock.ItemAdapter;

import static android.support.v7.widget.RecyclerView.NO_ID;

final class AddCustomRingtoneHolder extends ItemAdapter.ItemHolder<Uri> {

    AddCustomRingtoneHolder() {
        super(null, NO_ID);
    }

    @Override
    public int getItemViewType() {
        return AddCustomRingtoneViewHolder.VIEW_TYPE_ADD_NEW;
    }
}