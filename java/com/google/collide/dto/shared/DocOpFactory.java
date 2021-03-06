// Copyright 2012 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.collide.dto.shared;

import com.google.collide.dto.DocOp;
import com.google.collide.dto.DocOpComponent.Delete;
import com.google.collide.dto.DocOpComponent.Insert;
import com.google.collide.dto.DocOpComponent.Retain;
import com.google.collide.dto.DocOpComponent.RetainLine;

// TODO: These should be moved to an Editor2-specific package
/**
 */
public interface DocOpFactory {
  Delete createDelete(String text);

  DocOp createDocOp();

  Insert createInsert(String text);

  Retain createRetain(int count, boolean hasTrailingNewline);

  RetainLine createRetainLine(int lineCount);
}
