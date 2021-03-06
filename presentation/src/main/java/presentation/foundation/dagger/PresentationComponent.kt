/*
 * Copyright 2017 Victor Albertos
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

package presentation.foundation.dagger

import dagger.Component
import presentation.sections.dashboard.DashBoardActivity
import presentation.sections.launch.LaunchActivity
import presentation.sections.users.detail.UserActivity
import presentation.sections.users.list.UsersFragment
import presentation.sections.users.search.SearchUserFragment
import javax.inject.Singleton

/**
 * Every fragment or activity which needs to be part of the dependency graph built by Dagger needs
 * to be declared in this component in order to be injected from their respective base classes.
 */
@Singleton
@Component(modules = arrayOf(PresentationModule::class))
interface PresentationComponent {
    fun inject(launchActivity: LaunchActivity)
    fun inject(dashBoardActivity: DashBoardActivity)
    fun inject(userActivity: UserActivity)
    fun inject(searchUserFragment: SearchUserFragment)
    fun inject(usersFragment: UsersFragment)
}
