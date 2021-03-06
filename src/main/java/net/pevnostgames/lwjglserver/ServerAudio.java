/*******************************************************************************
 * Copyright 2011 See AUTHORS file.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package net.pevnostgames.lwjglserver;

import com.badlogic.gdx.Audio;
import com.badlogic.gdx.audio.AudioDevice;
import com.badlogic.gdx.audio.AudioRecorder;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.files.FileHandle;
import net.pevnostgames.lwjglserver.exception.ServerAudioException;

public class ServerAudio implements Audio {

	@Override
	public AudioDevice newAudioDevice(int samplingRate, boolean isMono) {
		throw new ServerAudioException();
	}

	@Override
	public AudioRecorder newAudioRecorder(int samplingRate, boolean isMono) {
		throw new ServerAudioException();
	}

	@Override
	public Sound newSound(FileHandle fileHandle) {
		throw new ServerAudioException();
	}

	@Override
	public Music newMusic(FileHandle file) {
		throw new ServerAudioException();
	}
}
