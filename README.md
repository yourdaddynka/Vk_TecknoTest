## Команды:
* user create:
```localhost:8080/api/v1/new-user```
```
{
    "role": "ROLE_USERS",
    "name": "username",
    "password": "password"
}

```
## Возможные роли для регистрации(см. выше):
```
ROLE_ADMIN, ROLE_USER, ROLE_POSTS, ROLE_ALBUMS, ROLE_PHOTOS, ROLE_COMMENTS, ROLE_POSTS_VIEWER, ROLE_POSTS_EDITOR
```

## Адреса без прав доступа:
```localhost:8080/api/v1/proxy/welcome```

```localhost:8080/api/v1/apps/welcome```

```localhost:8080/api/v1/new-user```

## Особенности реализации
* Использование Spring Web и Spring WebClient для реализации прокси-сервера, перенаправляющего запросы на JSONPlaceholder API.
* Кэширование ответов от JSONPlaceholder API в памяти с помощью Spring Cache и SimpleCacheManager.
* Аутентификация и авторизация пользователей с помощью Spring Security.
* Различные роли пользователей, определяющие доступ к ресурсам.
* Конфигурация кэша определяется в классе CacheConfig, позволяющем использовать аннотации Spring Cache.
* Логирование каждого метода с помощью АОП.

## Весь функционал реализован через ```localhost:8080/api/v1/proxy/**```
##  Очень дополнительно 
* Контроллер AllServiceCRUDController реализует функциональность CRUD для сущностей User, Post, Album, Photo, Comment, и Todo.
(Сначала не понял задание, а после реалиации стало жалко удалять)




